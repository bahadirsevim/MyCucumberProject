package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java"},
        glue = {"StepDefinitions"},
        dryRun = false
)

public class RunnerGenel extends AbstractTestNGCucumberTests {
}


