package com.massmutual.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "features/test.feature",
		glue = {"com.massmutual.steps","com.massmutual.utilities"},
		plugin = {"pretty","html:target/HtmlReports"},
		monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	
	
}
