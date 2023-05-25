Feature: Add Register

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-11 Add Register in Created Unit

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | unitMas       |

    And User search the item
      | search | TestUNIT |

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

    Then User should see success message
      | success | success |
