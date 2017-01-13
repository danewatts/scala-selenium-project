@suite @wip
Feature: Bing home page

  As a user
  I want to be able to search the internet for a word
  So that I can find out more about it

  # Background contains steps which are needed before each test. This is used to make writing tests more efficient
  Background:

    Given I am on the Bing home page

  # A scenario is an individual test case
  Scenario: Page should display expected links

    Then I should see the correct links in the nav bar

  # Scenario Outline is used where individual test cases follow the same steps using different data
  Scenario Outline: I search for key words on Google

    # The yellow text below is a variable which is substituted with the values in the below table when the tests are
    # actually executed
    When I enter <searchTerm> into the search bar
    And I click the search button
    Then the page title should be <expectedPageTitle>

  # Examples and the table seen below are used alongside Scenario Outline to test the same steps with different values
  Examples:

    | searchTerm | expectedPageTitle |
    | Selenium   | Selenium - Bing   |
    | Testing    | Testing - Bing    |
    | HMRC       | HMRC - Bing       |
    | Agile      | Agile - Bing      |
