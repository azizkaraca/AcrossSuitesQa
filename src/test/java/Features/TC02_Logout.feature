Feature: Logout Functionality

  Background:
    Given Navigate to QA Environment

  @SmokeTest @Regression
  Scenario: TC-01 Login with valid username and valid password
    When Login with QA user credentials
    Then Login should be successfully
    And Go to MyAccount
    And Click Logout Button
    Then User Should Logout Successfully

