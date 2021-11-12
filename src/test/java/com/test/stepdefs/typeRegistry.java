package com.test.stepdefs;

import baseAndHooks.BaseClass;
import io.cucumber.java.DocStringType;
import io.cucumber.java.en.Given;
import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.JsonMappingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class typeRegistry extends BaseClass {

	private BaseClass base;

	/*public typeRegistry(BaseClass base) {
		this.base = base;
	}*/

	ObjectMapper objectMapper = new ObjectMapper();

	@DocStringType
	public JsonNode json(String docString) throws Exception, JsonProcessingException {
		return objectMapper.readTree(docString);

	}

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition(JsonNode json) throws InterruptedException {
		/*base.driver.get("https://www.youtube.com");
		Thread.sleep(5000);*/
		System.out.println("docstring : " + json.get("Name"));
		System.out.println("docstring : " + json.get("Company"));
	}

}
