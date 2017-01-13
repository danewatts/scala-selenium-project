package utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.{FirefoxDriver, FirefoxProfile}

/**
  * Created by tom on 03/01/17.
  */
trait Browser {

  def createFirefoxBrowser: WebDriver = {
    val profile: FirefoxProfile = new FirefoxProfile
    profile.setPreference("javascript.enabled", true)
    val webDriver = new FirefoxDriver()
    webDriver.manage().window().maximize()
    webDriver
  }

}