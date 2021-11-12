package com.test.stepdefs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.searchmodule.pages.SearchPage;

import baseAndHooks.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*public class SearchSteps2 {

	private SearchPage searchPage;
	private WebDriver driver;

	public SearchSteps2 () {
		System.out.println("SearchSteps args constructor");
		if(this.driver==null)
			this.driver = new BaseClass().createDriver().getDriver();
	}*/
public class SearchSteps2 extends BaseClass{

	private SearchPage searchPage;
	private BaseClass base;

	public SearchSteps2(BaseClass base) {
		System.out.println("SearchSteps args constructor");
		this.base = base;
	}
	
	 
	
	
	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
		System.out.println("Its given 1 "+arg1);
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
		System.out.println("Its when 1 "+arg1);
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
		System.out.println("Its then 1");
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
		System.out.println("Its then 2");
	}


	@Given("^I ama on the website duck-duck-go$")
	public void launchSite() {
		System.out.format("Thread ID - %2d -  feature file.\n", Thread.currentThread().getId());

		searchPage = new SearchPage(base.driver);
		searchPage.goTo();
	}

	@And("^I entera the \"([^\"]*)\" to search$")
	public void enterKeyworda(String keyword) {
		searchPage.doSearch(keyword);
	}

	@And("^I navigatea to videos search$")
	public void navigateTovideosa() {
		searchPage.goToVideos();
	}

	@Then("^I shoulda get minimum (\\d+) search results$")
	public void verifySearchResultsa(int min) {
		int size = searchPage.getResult();
		System.out.println("minimum value : "+min);
		// Assert.assertTrue(size > min);
	}
	
}
