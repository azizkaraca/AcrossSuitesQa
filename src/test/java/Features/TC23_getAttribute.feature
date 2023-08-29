Feature: New Report Creation

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
    And Change language to English

  Scenario:
    And User selects a Station
      | gavdos |

    And User uses ctrl MM combination to open edit mode

    And User clicks following Buttons
      | generalTool |


