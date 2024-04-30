Feature: Devices Creation

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: TC-03 Create a new Device

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | devicesMas    |
      | newDevice     |

    And User enters data to necessary areas
      | name        | TestDEVICE                 |
      | model       | TestMODEL                  |
      | webSite     | http://www.testKRCtest.com |
      | description | DeviceForTest              |

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

    And User goes to devices
      | devicesT |

    And User search the item
      | search | TestDEVICE |

    And User clicks following Buttons
      |searchButton|

    Then User should to find the item in field
      | nameContains | TestDEVICE |








