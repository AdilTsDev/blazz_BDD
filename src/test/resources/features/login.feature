

Feature: login
  As a user, I should be able to login to the system

  Background:
    And click login link on the header

  Scenario: Login with valid account
    And enter "wennn66llw5" for username
    And enter "445544" for password
    And click the login button
    Then verify that use is login successfully

  Scenario: Login with invalid account
    And enter "we766llw5" for username
    And enter "445544" for password
    And click the login button
    Then verify that user is not login


  Scenario: Login with valid username and invalid password
    And enter "wennn66llw5" for username
    And enter "44885544" for password
    And click the login button
    Then verify that user entered wrong password

