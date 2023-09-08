Feature: ID sorting

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English

  Scenario:
    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | assetsMas     |
      | idColumn      |

    And User check if the ID sorting working correct

