package com.test.stepdefs;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class SearchSteps_DataTables {

	@Then("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable arg1) throws Throwable {
		List<Map<String,String>> data = arg1.asMaps(String.class, String.class);
	    System.out.println("Size of the list"+data.size());
	    for (Map<String, String> data1 : arg1.asMaps(String.class, String.class)) {
	    	System.out.println(data1.get("username"));
	    	System.out.println(data1.get("pwd"));
	    }
	    
	    List<List<String>> data2 = arg1.raw();
	    System.out.println("Size of the list"+data.size());
	}

	
}
