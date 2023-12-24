package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "..\\CucumberJava\\src\\test\\java\\Features\\VerifyUrlFeature.feature",
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target\\Cucumber-reports\\report1.html"}
		)
public class VerifyUrlRun {

}
