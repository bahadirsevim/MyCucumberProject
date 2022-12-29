package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/contact_us_test.feature"},
        glue = {"StepDefinitions"},
        plugin = {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-html-report",
                "usage:target/cucumber-usage.json",""+
                "junit:target/cucumber-results.xml"
        },
        dryRun = false
)

public class SmokeTest extends AbstractTestNGCucumberTests {
}
