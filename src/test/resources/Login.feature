@Login
Feature: Login Test

  Scenario Outline: As a user i want to check if i can login successfully
    Given I go to the Home Page
    And I click the login link
    And I enter email "<email>" address
    And I enter password "<password>"
    When I click login button
    Then I verify that "<user>" is logged in
    And I sign out

    Examples: 
      | email                   | password |user          |
      | escosolo7@gmail.com     | Ikeama78 | Emeka Onuorha|
      | switch146@gmail.com     | Escosolo7|  switch Esco  |

#  @Login
#  Scenario Outline: As a user i want to check if i can login incorrectly
#    Given I go to the Home Page
#    And I click the login link
#    And I enter email "<email>" address
#    And I enter password "<password>"
#    When I click login button
#    Then I see an error "<error message>" message details
#
#    Examples:
#      | email                   | password | error message|
#      | escosolo7@gmail.com     |          | Password is required.|
#      |                         | Ikeama78 | An email address required.|
#      | xxxxx@gmail.com         | Ikeama78 | Authentication failed.|
#      | escosolo7@gmail.com     |  xxxxxxx |  Authentication failed.|
#      |                         |          | An email address required.|