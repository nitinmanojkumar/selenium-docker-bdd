@Webdriver1
Feature: Duck Duck Go Search2

	Background: User is Logged In
		Given I navigate to the login page

  Scenario Outline: I want to search on duck-duck-go site
  	Given I am on the website duck-duck-go
    Given I ama on the website duck-duck-go
    And   I entera the "<keyword>" to search
    And   I navigatea to videos search
    Then  I shoulda get minimum <int> search results

  Examples:
    | keyword    | int  |
    | java1      | 1  	|
    | kubernetes2| 2    |


