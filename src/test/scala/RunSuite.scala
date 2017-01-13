import cucumber.api.junit.Cucumber
import cucumber.api.junit.Cucumber.Options
import org.junit.runner.RunWith

/*
  Right click on a runner file and press "Run" to run the tests it covers.
 */

@RunWith(classOf[Cucumber])
@Options(
  // The path to the feature files.
  features = Array("/home/tom/Applications/hmrc-development-environment/hmrc/scala-selenium-project/src/test/resources/features"),
  // Where to find step definitions.
  glue = Array("stepdefs"),
  format = Array("pretty", "html:target/cucumber-report"),
  // Runs only steps or features with the specified @ tag.
  tags = Array("@suite")
)
class RunSuite {
}