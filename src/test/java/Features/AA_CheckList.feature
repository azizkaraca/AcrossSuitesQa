Feature: Create List

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
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

    Then User should to find the item in List
      | nameList | TestAsset |
