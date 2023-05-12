Feature: Edit Device

  Background:
    Given Navigate to Web Page
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-07 Edit Created Devices

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
      | edit |

    And User edits the some data
      | displayName  | TestNameDisplayEdit  |
      | registerName | TestNameRegisterEdit |
      | scanRate     | 10200             |

    And User confirms the selection
      | save |
      | yes  |

#    Then User should see success message
#      |success|success|



