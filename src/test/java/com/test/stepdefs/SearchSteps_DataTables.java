package com.test.stepdefs;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps_DataTables {


	@Given("^user navigates to the website javatpoint\\.com$")
	public void user_navigates_to_the_website_javatpoint_com() throws Throwable {
		System.out.println("Its search3 given 1 ");
	}
	
	@Then("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable arg1) throws Throwable {
		
		List<Map<String,String>> data = arg1.asMaps(String.class, String.class);
	    System.out.println("Size of the list"+data.size());
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    
	    for (Map<String, String> data1 : arg1.asMaps(String.class, String.class)) {
	    	System.out.println(data1.get("username"));
	    	System.out.println(data1.get("pwd"));
	    }
	    
	    List<Map<String, String>> data2 = arg1.asMaps();
	    System.out.println("Username from the list : "+data2.get(0).get("username"));
	    System.out.println("Username from the list : "+data2.get(1).get("username"));
	    
	    data2.get(1).get("username");
	    System.out.println("Size of the list"+data.size());
	}

	
}
