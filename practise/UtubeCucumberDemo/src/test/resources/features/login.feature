Feature: login Page Automation
  Scenario Outline:check Login is successfully with valid credentials
    Given user is on login page
    When user enter valid "<username>" and "<password>"
    And click the login button
    Then user should be navigated to home page
    And close the browser
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |