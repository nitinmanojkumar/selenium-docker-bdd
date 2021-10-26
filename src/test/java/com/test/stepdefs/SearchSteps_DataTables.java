package com.test.stepdefs;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class SearchSteps_DataTables {

	@Then("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
	    System.out.println("Size of the list"+data.size());
	}

	
}
