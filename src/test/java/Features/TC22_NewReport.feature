Feature: New Report Creation

  Background:
    Given Navigate to QA Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  Scenario:
    And User selects a Station
    |gavdos|

    And User clicks following Buttons
    |burgerMenu|
    |burgerMenu|
    |reports   |
#    |newReport   | bcs of the page's unexpected errors then locator can not be found

