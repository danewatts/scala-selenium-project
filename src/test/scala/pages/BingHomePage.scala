package pages

import org.openqa.selenium.{By, WebElement}

/**
  * A page object model contains the variables and methods which are only used for a single page, in this case the Bing
  * home page.
  */
object BingHomePage extends BasePage {

  val bingSearchBar: By = By.id("sb_form_q")
  val bingSearchButton: By = By.id("sb_form_go")

  def webSearchLink: WebElement = webDriver.findElement(By.id("scpl0"))
  def imageSearchLink: WebElement = webDriver.findElement(By.id("scpl1"))
  def videoSearchLink: WebElement = webDriver.findElement(By.id("scpl2"))
  def mapsSearchLink: WebElement = webDriver.findElement(By.id("scpl3"))
  def newsSearchLink: WebElement = webDriver.findElement(By.id("scpl4"))
  def msnLink: WebElement = webDriver.findElement(By.linkText("MSN"))
  def officeOnlineLink: WebElement = webDriver.findElement(By.linkText("Office Online"))
  def outlookLink: WebElement = webDriver.findElement(By.id("outlook"))

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
