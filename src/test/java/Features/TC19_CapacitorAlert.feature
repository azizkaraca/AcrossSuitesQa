Feature: Create Capacitor

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    And User should accept secure alert
    Then Login should be successfully
    And Change language to English


  @Regression
  Scenario: TC-19 CapacitorAlert

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | capacitorsMas |

    And User search the item
      | search | TestCapacitor |

    And User clicks following Buttons
      | arrowButton |
      | dashboardIn |

    And User switch to edit mode

    And User clicks following Buttons
      | capacitors |

    And User accept alert






