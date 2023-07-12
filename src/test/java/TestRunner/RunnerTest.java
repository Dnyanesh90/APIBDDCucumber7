package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeatureFile"},
		glue= {"StepDefinationLayer"},
		dryRun=true,
		monochrome=true
		
		)


public class RunnerTest extends AbstractTestNGCucumberTests {

}
