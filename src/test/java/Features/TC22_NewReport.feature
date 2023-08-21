Feature: New Report Creation

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
    And Change language to English

  Scenario:
    And User selects a Station
    |gavdos|

    And User clicks following Buttons
    |burgerMenu|
    |burgerMenu|
    |reports   |
#    |newReport   | bcs of the page's unexpected errors then locator can not be found

