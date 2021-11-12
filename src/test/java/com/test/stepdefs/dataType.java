package com.test.stepdefs;

import java.util.List;
import java.util.Map;

import baseAndHooks.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

public class dataType extends BaseClass {

	private BaseClass base;

	/*
	 * public typeRegistry(BaseClass base) { this.base = base; }
	 */

	@DataTableType(replaceWithEmptyString = "blank")
	public userInfo convert(Map<String, String> entry) {
		return new userInfo(entry.get("username"), entry.get("password").concat("hey"));

	}

	@Given("I login as Admin")
	public void i_login_as_admin(DataTable userInfoList) {
		System.out.println("Datatable as Maps");
		for (Map<String, String> entry : userInfoList.asMaps()) {
			System.out.println(entry.get("username"));
			System.out.println(entry.get("password"));
		}
	}

	@Given("I login as Admin1")
	public void i_login_as_admin1(List<userInfo> userInfoList) {
		for(userInfo s:userInfoList) {
		System.out.println("usernameFromList : " + s.username);
		System.out.println("password : " + s.password);
		}
	}

	private class userInfo {
		public String username;
		public String password;

		public userInfo(String username, String password) {
			this.username = username;
			this.password = password;
		}

	}
}
