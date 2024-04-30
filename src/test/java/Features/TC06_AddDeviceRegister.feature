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
      | searchButton |
      | arrowForward |

    And User selects a Breadcrumb
      | registers |

    And User clicks following Buttons
      | newAdd |

    And User enters data to necessary areas
      | registerName    | TestNameRegister        |
      | displayName     | TestNameDisplay         |
      | description     | TestDescriptionRegister |
      | registerAddress | TestAddressRegister     |
      | scanRate        | 1200                    |

    And User clicks following Buttons
      | languageSwitch |
      | languageEl     |

    And User enters data to necessary areas
      | displayName | TestNameDisplayEl |

    And User clicks following Buttons
      | languageSwitch |
      | languageEl2    |

    And User enters data to necessary areas
      | description | TestDescriptionRegisterEl |

    And User confirms the selection
      | save |
      | yes  |

    Then User should see success message
      | success | success |
