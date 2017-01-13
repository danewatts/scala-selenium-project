import cucumber.api.junit.Cucumber
import cucumber.api.junit.Cucumber.Options
import org.junit.runner.RunWith

/*
  RunWip is useful for dropping before a feature to run it without running the entire suite.
 */

@RunWith(classOf[Cucumber])
@Options(
  features = Array("/home/tom/Applications/hmrc-development-environment/hmrc/scala-selenium-project/src/test/resources/features"),
  glue = Array("/home/tom/Applications/hmrc-development-environment/hmrc/scala-selenium-project/src/test/scala/stepdefs"),
  format = Array("pretty", "html:target/cucumber-report"),
  tags = Array("@wip")
)
class RunWip {
}