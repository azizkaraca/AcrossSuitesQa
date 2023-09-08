Feature: Create Capacitor

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English


  @Regression
  Scenario: TC-18 Create a new Capacitor

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | capacitorsMas |
      | addIcon       |

    And User enters data to necessary areas
      | name        | TestCapacitor   |
      | description | TestDescription |

    And User clicks following Buttons
      | category   |
      | engine     |
      | heatEngine |
      | confirm    |

    And User confirms the selection
      | save |
      | yes  |

    And User goes to Capacitors
      |capacitors|


#    And User should see success message
#      | success | success |

