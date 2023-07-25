Feature: sample feature

  Scenario: invalid login scenario
    Given a user is at the login page
    When he user enters incorrect username or password
    Then the system should show an error message saying "Invalid username/password"