Feature: Check Right Click

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: Right Click

    And User clicks following Buttons
    |gavdos|

    And User uses ctrl MM combination to open edit mode

    And User right click to reach edit
    |blankAreaGraph|


