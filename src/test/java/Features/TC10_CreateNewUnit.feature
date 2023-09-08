Feature: Create Unit

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
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
#      | connections | 100                        | -> this deleted from app

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

#    And User goes to Units -> looks no need it, it is navigating Unit list page already
#      | units |

    And User search the item
      | search | TestUNIT |

    Then User should to find the item in field
      | nameContains | TestUNIT |
