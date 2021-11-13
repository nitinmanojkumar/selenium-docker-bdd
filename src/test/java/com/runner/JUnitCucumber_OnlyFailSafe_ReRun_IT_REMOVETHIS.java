package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@test-output/rerunfailed.txt", 
		glue = { "com.test.stepdefs","AppHooks" }, 
		monochrome = true, 
		plugin = {"pretty",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		        "timeline:test-output/test-output-thread-rerun/",
		        "html:test-output/cucumber-reports/rerun-cucumber-report.html",
		        "json:test-output/cucumber-reports/rerun-Cucumber.json",
		        "junit:test-output/cucumber-reports/rerun-Cucumber.xml",
		        "rerun:test-output/re-rerunfailed.txt"})


public class JUnitCucumber_OnlyFailSafe_ReRun_IT_REMOVETHIS {


}
