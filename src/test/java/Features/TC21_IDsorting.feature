Feature: ID sorting

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English

  Scenario:
    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | assetsMas     |
      | idColumn      |

    And User check if the ID sorting working correct

