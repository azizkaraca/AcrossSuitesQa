Feature: Login Functionality

  Background:
    Given Navigate to QA Environment

  @SmokeTest
    Scenario: TC-01 Login with valid username and valid password
    When Login with QA user credentials
    Then Login should be successfully


