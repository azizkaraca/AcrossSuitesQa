Feature: Edit Device

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: TC-07 Edit Register of Created Devices

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
      | edit |

    And User edits the some data
      | displayName  | TestNameDisplayEdit  |
      | registerName | TestNameRegisterEdit |
      | scanRate     | 10200             |

    And User confirms the selection
      | save |
      | yes  |

    Then User should to find the item in field
      | nameContains | TestNameDisplayEdit |



