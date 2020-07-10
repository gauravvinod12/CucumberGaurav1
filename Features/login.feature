
Feature: A description

  Scenario: to test the functionality of login button for valid input
    Given I am on login page
    When i enter correct username and password
    And i click on login button
    Then i should land up to home page


  Scenario: to test the functionality of login button for Invalid input
    Given I am on login page
    When i enter Incorrect username and password
    And i click on login button
    Then i should not land up to home page