package automation.luma.runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(

		tags = "@TC2",
		features ="features", 
		glue = "automation.luma.stepDefinition", 
		plugin = {"pretty","junit:target/cucumber-reports/cucumber.xml",
				            "html:target/cucumber-reports/cucumber.html"}, 	
		monochrome = true, 
		dryRun = false,
		publish = true
		

)
public class TestRunner
{
	
	
}

