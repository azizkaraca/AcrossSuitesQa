Feature: Check Right Click

  Background:
    Given Navigate to QA Environment
    When Login with PPC user credentials
    And User should accept secure alert
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: Right Click

    And User clicks following Buttons
    |gavdos|

    And User uses ctrl MM combination to open edit mode

    And User right click to reach edit
    |blankAreaGraph|


