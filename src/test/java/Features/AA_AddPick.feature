Feature: Add Folder

  Background:
    Given Navigate to Web Page
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-14 Add folder from PC

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | unitMas       |

    And User search the item
      | search | TestUNIT |

    And User clicks following Buttons
      | arrowButton |
      | edit        |
      | dropImage   |

    And User choose folder from PC
      |Test|

#    And User confirms the selection
#      | save |
#      | yes  |




