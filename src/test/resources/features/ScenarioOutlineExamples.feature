@ScenarioOutlineExamples
Feature: Feature step
	Its Description
	
	Background: User is Logged In
		Given I navigate to the login page
		When I submit username and password
		Then I should be logged in
	
	#Scenario Outline: or Scenario Template:
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

		#Examples: or Scenarios:
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      