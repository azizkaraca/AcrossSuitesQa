Feature: Add Unit

  Background:
    Given Navigate to Web Page
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English


  @Regression
  Scenario: TC-10 Create a new Unit

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | unitMas       |
      | addIcon       |

    And User enters data to necessary areas
      | name        | TestUNIT                   |
      | model       | TestMODELunit              |
      | webSite     | http://www.testKRCtest.com |
      | description | UnitForTest                |
      | connections | 100                        |

    And User selects necessary areas
      | manufacturer |
      | mas          |
      | protocol     |
      | modbus       |
      | category     |
      | engine       |
      | heatEngine   |
      | confirm      |
      | country      |
      | ukraine      |
      | year         |
      | 2023         |

    And User confirms the selection
      | save |
      | yes  |

    And User goes to Units
      | units |

    And User search the item
      | search | TestUNIT |

    Then User should to find the item in field
      | nameContains | TestUNIT |
