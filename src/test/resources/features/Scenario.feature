@BackgroundScenario
Feature: Feature step
	Its Description
	
	Background: User is Logged In
		Given I navigate to the login page
		When I submit username and password
		Then I should be logged in
		
	#Example or Scenario
	Scenario: Successful Login with Valid entries
		Given user navigates to the website javatpoint.com 
		When User Navigate to Login Page
		And user logs in through Login Window by using <Username> as "username1" by using 
		And <Password> as "password1" by using
		Then login must be successful
		