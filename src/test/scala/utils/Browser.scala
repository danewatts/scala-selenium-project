package utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.{ChromeDriver, ChromeDriverService, ChromeOptions}
import org.openqa.selenium.firefox.{FirefoxDriver, FirefoxProfile}
import org.openqa.selenium.remote.DesiredCapabilities

trait Browser {

  val workingDir: String = System.getProperty("user.dir")
  //V2.38
  val chromeDriverPath: String = workingDir + "/src/test/resources/driverfiles/chromedriver"

  if (System.getProperty("webdriver.chrome.driver") == null) {
    System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, chromeDriverPath)
  }

  def createFirefoxBrowser: WebDriver = {
    val profile: FirefoxProfile = new FirefoxProfile
    profile.setPreference("javascript.enabled", true)
    val webDriver = new FirefoxDriver()
    webDriver.manage().window().maximize()
    webDriver
  }

  def createChromeDriver: WebDriver = {
    val options = new ChromeOptions()
    val capabilities = DesiredCapabilities.chrome()
    val service: ChromeDriverService = new ChromeDriverService.Builder().usingAnyFreePort().build()
    options.addArguments("test-type")
    options.addArguments("disable-infobars")
    options.addArguments("--start-maximized")
    capabilities.setCapability(ChromeOptions.CAPABILITY, options)
    options.merge(capabilities)
    val driver = new ChromeDriver(service,options)
    val caps = driver.getCapabilities
    val browserName = caps.getBrowserName
    val browserVersion = caps.getVersion
    println( "Browser name & version: "+ browserName+" "+browserVersion)
    driver
  }

}