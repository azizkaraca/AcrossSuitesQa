Feature: Create Capacitor

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English


  @Regression
  Scenario: TC-18 Create a new Capacitor

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | capacitorsMas |
      | addIcon       |

    And User enters data to necessary areas
      | name        | TestCapacitor     |
      | description | TestDescription |

    And User confirms the selection
      | save |
      | yes  |

    And User should see success message
      | success | success |

