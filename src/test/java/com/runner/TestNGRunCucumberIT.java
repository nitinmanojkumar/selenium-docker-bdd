package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "com.test.stepdefs","AppHooks"  }, 
	plugin = {"pretty",
        "html:target/cucumber-reports/cucumber-report.html",
        "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "rerun:target/rerun.txt",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
	monochrome = true )

public class TestNGRunCucumberIT extends AbstractTestNGCucumberTests{
	
	     
}
