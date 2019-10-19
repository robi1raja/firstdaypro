  Feature: Facebook login feature Test

  Scenario: User be able to signin with valid credentials
    Given User able to go to home page
    When User able to enter Email
    And User able to enter Password
    And User able to click Login
    And Login should be succesfull
    Then close the browser

 