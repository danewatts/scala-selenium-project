package suites

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/*
  RunWip is useful for dropping before a feature to run it without running the entire suite.
 */

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("stepdefs"),
  format = Array("pretty", "html:target/cucumber-report"),
  tags = Array("@wip")
)
class RunWip {
}