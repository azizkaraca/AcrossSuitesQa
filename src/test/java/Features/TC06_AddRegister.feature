Feature: Add Register

  Background:
    Given Navigate to Web Page
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-06 Add Register in Created Devices

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | devicesMas    |

    And User search created device name
      | search | TestDEVICE |

    And User clicks following Buttons
      | arrowButton |

    And User switch to edit mode

    And User selects a Breadcrumb
      | registers |

    And User clicks following Buttons
      | addIcon |

    And User enters data to necessary areas
      | displayName     | TestNameDisplay         |
      | registerName    | TestNameRegister        |
      | registerAddress | TestAddressRegister     |
      | scanRate        | 1200                    |
      | description     | TestDescriptionRegister |

    And User confirms the selection
      | save |
      | yes  |
