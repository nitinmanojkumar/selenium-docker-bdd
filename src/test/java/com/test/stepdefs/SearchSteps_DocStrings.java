package com.test.stepdefs;

import cucumber.api.java.en.Then;

public class SearchSteps_DocStrings {

	@Then("^I should receive an email with:$")
	public void i_should_receive_an_email_with(String arg1) throws Throwable {
		String str=arg1;
		System.out.println("String in docStrings : "+str);

		for(int x=0;x<str.length();x++) {
			System.out.println(str.charAt(x));
		}
	}
	
}
