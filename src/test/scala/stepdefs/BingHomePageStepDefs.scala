package stepdefs

// Import statements are used to import sections of code defined in external libraries or packages
import cucumber.api.java.en.Given
import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.browserlaunchers.locators.GoogleChromeLocator
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.scalatest.Matchers
import pages.BasePage
import pages._

/*
 * Step definition files link to feature files via the 'Given', 'When', 'Then' statements.
 * They contain the code to be executed at each step of the journey to simulate user behaviour or check page content.
 */

// Class declaration. This marks that the section of code belonging to the class named below has begun.
class BingHomePageStepDefs extends ScalaDsl with EN with Matchers with BasePage {

  // A step such as this one links to the line of the feature file with the same text
  Given("""^I am on the Bing home page$""") { () =>
    // Tells webDriver to open a browser to the URL defined within bingUrl
    webDriver.navigate().to(bingUrl)
//    checkPageTitle("Bing")
    val pageTitle = webDriver.getTitle
    // Assert statements check to see if the statement inside the brackets is true, if it is not the test fails.
    assert(pageTitle.equals(BingHomePage.pageTitle))

  }

  Then("""^I should see the correct links in the nav bar$""") { () =>
    // Methods held in a page object model are referenced as below, page.methodName() or page.variableName
    BingHomePage.validateHomePageLinks()

  }

  /*
   * The (.*?) in the step definition is replaced by the variables in the data table in the feature file
   * They are passed into the step through the parameter (searchTerm: String), which tells the step to look for the
   * Strings under the heading searchTerm in the table.
   */
  When("""^I enter (.*?) into the search bar$""") { (searchTerm: String) =>
    // Within the method you do not need to define the data type of the named parameter
    BingHomePage.enterSearchTerm(searchTerm)
  }

  And("""^I click the search button$""") { () =>
    BingHomePage.clickSearchButton()
  }

  Then("""^the page title should be (.*?)$""") { (expectedPageTitle: String) =>
    checkPageTitle(expectedPageTitle)
  }

}
