Feature: Create Assets

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English


  @Regression
  Scenario: TC-14 Create a new Assets

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | assetsMas     |
      | addIcon       |

    And User enters data to necessary areas
      | name              | TestAsset       |
      | description       | TestDescription |
      | nominalPowerNum   | 1200            |
      | potentialPowerNum | 1300            |
      | techMinimumNum    | 1400            |
      | variableCostNum   | 1500            |

    And User selects necessary areas
      | category          |
      | engine            |
      | heatEngine        |
      | confirm           |
      | nominalPowerArr   |
      | powerKW           |
      | potentialPowerArr |
      | powerKW           |
      | techMinimumNArr   |
      | powerKW           |
      | variableCostArr   |
      | costKWh           |

    And User confirms the selection
      | save |
      | yes  |

    And User goes to Assets
      | assets |

    And User search the item
      | search | TestAsset |

    Then User should to find the item in field
      | nameContains | TestAsset |
