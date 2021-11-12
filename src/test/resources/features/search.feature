@Webdriver
Feature: Duck Duck Go Search

	Background: User is Logged In
		Given I navigate to the login page

  Scenario Outline: I want to search on duck-duck-go site
    Given I am on the website duck-duck-go
    And   I enter the "<keyword>" to search
    And   I navigate to videos search
    Then  I should get minimum 2 search results

  Examples:
    | keyword    |
    | test       |
    | test2      |

