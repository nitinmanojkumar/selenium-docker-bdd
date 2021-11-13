package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources", glue = { "com.test.stepdefs","AppHooks" }, 
		//dryRun=true,  to veify if all the steps having definition, by default false
		//strict=false, to skip the undefined steps, by default true
		monochrome = true, // to make the console output into readable, by default false
		tags="@tag",
		plugin = {"pretty",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		        "timeline:test-output/test-output-thread-normal/",
		        "html:test-output/cucumber-reports/cucumber-report.html",
		        "json:test-output/cucumber-reports/Cucumber.json",
		        "junit:test-output/cucumber-reports/Cucumber.xml",
		        "rerun:test-output/rerunfailed.txt"})

public class JUnitCucumber_OnlyFailSafe_IT {

}
