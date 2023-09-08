Feature: New Report Creation

  Background:
    Given Navigate to QA Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  Scenario:
    And User selects a Station
      | gavdos |

    And User uses ctrl MM combination to open edit mode

    And User clicks following Buttons
      | generalTool |


