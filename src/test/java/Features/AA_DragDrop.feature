Feature: Drag Drop

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English


  @Regression
  Scenario: Drag Drop Method Check

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | assetsMas     |

    And User search the item
      | search | TestAsset |

    And User clicks following Buttons
      | arrowButton |

    And User switch to edit mode

    And User clicks following Buttons
      | screenIcon      |

#    And User drag and drop
#      | screenTemplate2 | mainBoard |
#
#    And User confirms the selection
#      | no |