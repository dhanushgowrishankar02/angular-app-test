Feature: Login Functionality

  Scenario Outline: Login attempt with different credentials
    Given I am on the login page
    When I enter email "<email>" and password "<password>"
    And I click on the login button
    Then I should see the message "<message>"

    Examples:
      | email                | password       | message                     |
      | testuser@example.com | correctpass    | Dashboard                   |
      | testuser@example.com | wrongpass      | Invalid credentials         |
      |                      |                | Email and Password required |
      | abc                  | correctpass    | Please enter a valid email  |
      | testuser@example.com | correctpass    | Dashboard                   |
