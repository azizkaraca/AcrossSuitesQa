Feature: Add Register

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: TC-06 Add Register in Created Devices

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | devicesMas    |

    And User search the item
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

    Then User should see success message
      | success | success |
