package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//Features//LoginDDT.feature"},
		glue="StepDefinations",
		plugin= {"pretty", "html:reports/myreport.html",
				"json:reports/myreort.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)

public class testRun {

}
