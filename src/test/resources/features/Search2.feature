@Webdriver
Feature: Duck Duck Go Search2

	Background: User is Logged In
		Given I navigate to the login page

@tag
  Scenario Outline: I want to search on duck-duck-go site
  	Given I am on the website duck-duck-go
    Given I ama on the website duck-duck-go
    And   I entera the "<keyword>" to search
    And   I navigatea to videos search
    Then  I shoulda get minimum <int> search results

  Examples:
    | keyword    | int  |
    | yamaha     | 1  	|
    | honda      | 2    |

@tag1
  Scenario Outline: I want to search on duck-duck-go site
  	Given I am on the website duck-duck-go
    Given I ama on the website duck-duck-go
    And   I entera the "<keyword>" to search
    And   I navigatea to videos search
    Then  I shoulda get minimum <int> search results

  Examples:
    | keyword    | int  |
    | ktm        | 1  	|
    | ducati     | 2    |


