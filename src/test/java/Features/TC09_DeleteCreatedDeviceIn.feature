Feature: Devices Creation

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: TC-09 Delete the Created Device in

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | devicesMas    |

    And User search the item
      | search | TestDEVICE |

    And User clicks following Buttons
      | arrowButton |

    When User delete selected item

    Then User should not find item
      | nameContains | TestDEVICE |







