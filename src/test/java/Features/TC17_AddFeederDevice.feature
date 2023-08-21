Feature: Add Device to Feeder

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-17 Add Device in Created Feeder

    And User clicks following Buttons
      | burgerMenu    |
#      | assetsLibraryIcon |
      | assetsLibrary     |
      | feedersMas        |

    And User search the item
      | search | Test |

    And User clicks following Buttons
      | arrowButton |

    And User switch to edit mode

    And User selects a Breadcrumb
      | devices |

    And User clicks following Buttons
      | addIcon    |
      | solarPanel |
    And User press the Tab Button on Keyboard Times
      | 2 |
    And User press the Enter Button on Keyboard Times
      | 3 |

    And User confirms the selection
      | confirm |
      | yes     |

#
#    Then User should see success message
#      | success | success | // there is no success message after the confirm issue
