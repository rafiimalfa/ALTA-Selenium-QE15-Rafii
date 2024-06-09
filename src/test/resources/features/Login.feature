@tugas
Feature: Login Test
  Scenario: Login with valid credentials
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User should be directed to the dashboard page

  Scenario: Login with locked out user
    Given User open the web sauce demo
    When User input "locked_out_user" as userName and "secret_sauce" as password and click login
    Then User should be see error message with title "Epic sadface: Sorry, this user has been locked out."

