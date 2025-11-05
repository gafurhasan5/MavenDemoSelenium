Feature: login Page Automation
  Scenario: check Login is successfully with valid credentials
    Given user is on login page
    When user enter valid username and password
    And click the login button
    Then user should be navigated to home page
    And close the browser
