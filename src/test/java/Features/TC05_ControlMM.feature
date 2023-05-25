Feature: Keyboard Functions Test

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-05 Ctrl-MM

    And User selects an Island
      | gavdos |

    And User uses ctrl MM combination to open edit mode


