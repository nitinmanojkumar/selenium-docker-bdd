@DocStrings
Feature: Feature step
	Its Description
	
	Background: User is Logged In
		Given I navigate to the login page
		
	Scenario: Successful Login with Valid entries
		Given user navigates to the website javatpoint.com
		Then I should receive an email with:
  	"""
  	Dear bozo,
  	#hey
  	Please click this link to reset your password
  	"""