@Register
Feature: Register New User

  Scenario Outline: As a user, I want to create an account
    Given I go to the Home Page
    And I click the login link
    And I enter my new email address
    And I click on the create account button
    And I click on male radio button
    And I enter a firstname "<firstname>"
    And I enter a lastname "<lastname>"
    And I enter a "<password>"
    And I enter my date of birth
    And I enter address
    And I enter city
    And I enter state
    And I enter postal code
    And I enter country
    And I enter mobile number
    When I click register button
    Then I verify that "<user>" is logged in
    And I sign out
    Examples: 
      | firstname | lastname | password  |  user      |
      | switch    | Esco     | Escosolo7 |switch Esco |
     # | john      | ken      | Today01   | john ken   |
      #| James     | Brown    | Fantasy1  | James Brown|
      #| addy      | blue     | Remake2   | addy blue  |
      #| matt      | film     | Filmmath3 | matt film  |
      #| Reba      | keba     | Kebab4    | Reba keba  |
      #| may       | yuu      | Seduce5   | may yuu    |
      #| jack      | ma       | Assnel3   | jack ma    |
      #| john      | cena     | Cenajohn67  | john cena  |
      #| Amy       | ross     | Rose77    | Amy ross   |
