package com.test.stepdefs;

import java.util.Arrays;
import java.util.List;

import baseAndHooks.BaseClass;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class parameterType extends BaseClass {

	private BaseClass base;
	
	@ParameterType(value = "[^\"]*")
	public List<String> things(String material){
		return Arrays.asList(material.split(","));
	}
	
	
	@Given("I love my country will all my {things}")
	public void i_love_my_country_will_all_my_heart_soul_body(List<String> things) {
		for(String th:things) {
			System.out.println(th);
		}
	}
	
}
