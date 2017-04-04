package pages

import org.openqa.selenium.support.FindBy
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

/**
  * A page object model contains the variables and methods which are only used for a single page, in this case the Bing
  * home page.
  */
object BingHomePage extends BasePage {

  val bingSearchBar = By.id("sb_form_q")
  val bingSearchButton = By.id("sb_form_go")

  val webSearchLink = webDriver.findElement(By.id("scpl0"))
  val imageSearchLink = webDriver.findElement(By.id("scpl1"))
  val videoSearchLink = webDriver.findElement(By.id("scpl2"))
  val mapsSearchLink = webDriver.findElement(By.id("scpl3"))
  val newsSearchLink = webDriver.findElement(By.id("scpl4"))
  val msnLink = webDriver.findElement(By.linkText("MSN"))
  val officeOnlineLink = webDriver.findElement(By.linkText("Office Online"))
  val outlookLink = webDriver.findElement(By.id("outlook"))

  val pageTitle = "Bing"

  val webSearchValidation = "Web"
  val imageSearchValidation = "Images"
  val videoSearchValidation = "Videos"
  val mapsSearchValidation = "Maps"
  val newsSearchValidation = "News"
  val msnLinkValidation = "MSN"
  val officeLinkValidation = "Office Online"
  val outlookValidation = "Outlook.com"

  /*
   * Assertions for navbar links, storing blocks of code in methods like this is preferable to writing it directly to
   * the step definition to increase the code's readability
   */

  def validateHomePageLinks() {

    webSearchLink.getText should be (webSearchValidation)
    imageSearchLink.getText should be (imageSearchValidation)
    videoSearchLink.getText should be (videoSearchValidation)
    mapsSearchLink.getText should be (mapsSearchValidation)
    newsSearchLink.getText should be (newsSearchValidation)

    msnLink.getText should be (msnLinkValidation)
    officeOnlineLink.getText should be (officeLinkValidation)
    outlookLink.getText should be (outlookValidation)
  }

  def enterSearchTerm(searchTerm: String): Unit = {
//    findElementAndSendKeys(bingSearchBar, searchTerm)
    webDriver.findElement(By.id("sb_form_q")).sendKeys(searchTerm)
  }

  def clickSearchButton() {
//    clickOn(bingSearchButton)
    webDriver.findElement(By.id("sb_form_go")).click()
  }

}
