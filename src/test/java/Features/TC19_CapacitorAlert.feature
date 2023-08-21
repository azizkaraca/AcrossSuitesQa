Feature: Create Capacitor

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
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
      | info |

    And User accepts alert
#    it gives error when I try to accept alert by using switch to alert and still I could not handle how to do it







