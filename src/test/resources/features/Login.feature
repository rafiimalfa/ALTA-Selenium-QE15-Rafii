@tugas
Feature: Login Test
  Scenario Outline: Login with valid credentials
    Given User open the web sauce demo
    When User input "<username>" and "<password>" and click login
    Then User should be directed to the dashboard page
    Examples:
    |    username    |      password    |
    | standard_user  |    secret_sauce  |
    |   error_user   |    secret_sauce  |
    |   visual_user  |    secret_sauce  |
    |   performance_glitch_user  | secret_sauce |
    |  problem_user |     secret_sauce           |




  Scenario: Login with locked out user
    Given User open the web sauce demo
    When User input "locked_out_user" as userName and "secret_sauce" as password and click login
    Then User should be see error message with title "Epic sadface: Sorry, this user has been locked out."

  Scenario: Login with unvalid username
    Given User open the web sauce demo
    When User input "standard_use" as userName and " secret_sauce" as password and click login
    Then User should see error message with title "Epic sadface: Username and password do not match any user in this service"



