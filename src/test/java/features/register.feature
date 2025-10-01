Feature: Register Functionality

  Scenario Outline: Register with various user data
    Given I am on the register page
    When I enter email "<email>", password "<password>" and confirm password "<confirmPassword>"
    And I click on the register button
    Then I should see the message "<message>"

    Examples:
      | email              | password | confirmPassword | message                     |
      | user1@example.com  | pass123  | pass123         | Registration successful     |
      | user2@example.com  | pass123  | wrongpass       | Passwords do not match      |
      | invalid-email      | pass123  | pass123         | Please enter a valid email  |
      | user3@example.com  |          |                 | Password is required        |
