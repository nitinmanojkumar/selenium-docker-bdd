@typeRegistry
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
		"""json
		{
		"Name":"manoj",
		"Company":"CGI",
		"Country":"India"
		}
		"""
		Given I login as Admin
			| username		|	password	|
			| username1		|	  blank	  |
			| username2		|	  blank	  |
		Given I love my country will all my heart, soul, body
		Given I login as Admin1
			| username		|	password	|
			| username3		|	 blank		|
			| username4		|	[blank]		|