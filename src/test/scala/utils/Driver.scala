package utils

import org.openqa.selenium.WebDriver

import scala.util.Try

/**
  * Created by tom on 03/01/17.
  */
object Driver extends Browser {

  val instance: WebDriver = initialiseBrowser

  def initialiseBrowser: WebDriver = {
    val webDriver = createFirefoxBrowser
    webDriver
  }

  sys addShutdownHook {
    Try(instance.quit())
  }

}
