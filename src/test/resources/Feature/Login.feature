Feature: Web login
  Scenario: Login to homepage with user
    Given User go to page
    When User login into application with <email> and <password>
    Then The home page

