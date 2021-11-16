Feature: send message by contact
  As a user, I should be able to send message by contact link

  Background:
    And click contact button on the header

  Scenario: send message
    And enter "mailfil@pm.com" for contact_email
    And enter "sdfsdfsdf" for contact_name
    And enter "this is the message, ok " for message_Box
    And click the send Button
    Then verify that message send successfully
