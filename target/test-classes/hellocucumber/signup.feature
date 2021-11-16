@regression

Feature: Signup
  As a user, I should be able to signup an account

  Background:
    And click signup link on the header

  Scenario: signup an account
    And enter "fsd6wef" for signup_username
    And enter "sdcsdcs" for signup_password
    And click the SignUp Button
    Then verify that use is signUp successfully



  Scenario: signup with exciting account
    And enter "wennn66llw5" for signup_username
    And enter "445544" for signup_password
    And click the SignUp Button
    Then verify that alert with message
