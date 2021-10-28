package com.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.test.stepdefs"},
        tags = {"~@BackgroundScenario",
        		"~@ScenarioOutlineExamples",
        		"~@ScenarioTemplateScenarios",
        		"~@Webdriver",
        		"~@DocStrings",
        		"@DataTables"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun-reports/rerun.txt"
        })

public class JUnitTestRunner {

}
