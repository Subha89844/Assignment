Feature: Login Functionality

  Scenario: Valid Login
    Given user is on login page
    When user enters username "tomsmith" and password "SuperSecretPassword!"
    Then user should see secure area

  Scenario: Invalid Login
    Given user is on login page
    When user enters username "wrongusername" and password "wrongpassword"
    Then error message "Your username is invalid!" should be displayed

  Scenario: Empty Login
    Given user is on login page
    When user enters username "" and password ""
    Then error message "Your username is invalid!" should be displayed