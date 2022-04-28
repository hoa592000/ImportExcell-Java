Feature: Test User
  Scenario: Test User function setting
    Given User successfully login
    When User go to function User
    And User check select with "Admin", "User" and "Recruiter"
    Then User go to Dashboard