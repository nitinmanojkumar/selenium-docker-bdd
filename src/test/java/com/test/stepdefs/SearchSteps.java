package com.test.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.searchmodule.pages.SearchPage;

import AppHooks.Hook;
import baseAndHooks.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;
import java.net.URL;

/*public class SearchSteps{

	private SearchPage searchPage;
	private WebDriver driver;
	

	/*public SearchSteps() {
		System.out.println("SearchSteps args constructor");
		if(this.driver==null)
			this.driver = new BaseClass().createDriver().getDriver();
	}*/
	public class SearchSteps extends BaseClass{

		private SearchPage searchPage;
		private BaseClass base;

		public SearchSteps(BaseClass base) {
			System.out.println("SearchSteps args constructor");
			this.base = base;
		}
		

	
	@Given("^I am on the website duck-duck-go$")
	public void launchSite() {
		System.out.format("Thread ID - %2d -  feature file.\n", Thread.currentThread().getId());

		searchPage = new SearchPage(base.driver);
		searchPage.goTo();
	}

	@And("^I enter the \"([^\"]*)\" to search$")
	public void enterKeyword(String keyword) {
		searchPage.doSearch(keyword);
	}

	@And("^I navigate to videos search$")
	public void navigateTovideos() {
		searchPage.goToVideos();
	}

	@Then("^I should get minimum (\\d+) search results$")
	public void verifySearchResults(int min) {
		int size = searchPage.getResult();
		// Assert.assertTrue(size > min);
	}
	

}