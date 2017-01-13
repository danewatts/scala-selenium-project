package pages

import org.openqa.selenium.By
import org.scalatest.Matchers
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import utils.StartUpTearDown

/**
  * BasePage contains all of the variables and methods which are common to the entire test suite
  */
trait BasePage extends WebBrowser with Eventually with Matchers with StartUpTearDown {

  // For example, the home URL may be contained in BasePage
  val bingUrl = "https://www.bing.com/"

  /*
   * These are helper methods. The code below could be put directly into the step definition but it would
   * make the code less readable.
   */
  def findElement(selector: By) = webDriver.findElement(selector)
  def findElementAndSendKeys(selector: By, parameter: String) = webDriver.findElement(selector).sendKeys(parameter)
  def clickOn(selector: By) = webDriver.findElement(selector).click()

  // This is still an assert statement as can be seen on the step definitions but in the form of a helper method.
  def checkPageTitle(expectedPageTitle: String) = webDriver.getTitle should be (expectedPageTitle)

}
