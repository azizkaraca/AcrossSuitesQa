Feature: Keyboard Functions Test

  Background:
    Given Navigate to QA Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: TC-05 Ctrl-MM

    And User selects a Station
      | gavdos |

    And User uses ctrl MM combination to open edit mode


