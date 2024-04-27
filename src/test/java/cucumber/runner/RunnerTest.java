package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features="src/test/resources/features", glue = "cucumber/steps1") To include all feature files in folder


@CucumberOptions(features="src/test/resources/features/login.feature", glue = "cucumber/steps1", plugin = {"html:target/cucumber-reports/cucumber-html-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
