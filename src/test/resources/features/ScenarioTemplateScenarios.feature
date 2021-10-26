@ScenarioTemplateScenarios
Feature: Feature step
	Its Description
	
	Background: User is Logged In
		Given I navigate to the login page
		When I submit username and password
		Then I should be logged in
     
   #Scenario Outline: or Scenario Template: 
   Scenario Template: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

		#Examples: or Scenarios:
    Scenarios: 
      | name  | value | status  |
      | name3 |     9 | success |
      | name4 |    11 | Fail    |
