Feature: Create List

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    And User should accept secure alert
    Then Login should be successfully
    And Change language to English


  @Regression
  Scenario: verify created item contains in list
#    this works just if the item in first 15 records. otherwise need to change screen rows up to 100

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | assetsMas     |

    And User search the item
      | search | TestAsset |

    Then User should to find the item in field
      | nameContains | TestAsset |
