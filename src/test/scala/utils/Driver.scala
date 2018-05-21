package utils

import org.openqa.selenium.WebDriver

import scala.util.Try

object Driver extends Browser {

  val instance: WebDriver = initialiseBrowser

  def initialiseBrowser: WebDriver = {
    System.getProperty("browser", "chrome") match {
      case "firefox" ⇒ createFirefoxBrowser
      case _ ⇒ createChromeDriver
    }
  }

  sys addShutdownHook {
    Try(instance.quit())
  }

}
