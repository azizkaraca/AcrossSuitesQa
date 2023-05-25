Feature: Add Alarm

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-08 Add Alarm in Created Devices

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
      | alarms |

    And User clicks following Buttons
      | addIcon |

    And User enters data to necessary areas
      | name        | TestAlarm              |
      | message     | Test Alarm Message     |
      | description | Test Alarm Description |

    And User selects necessary areas
      | type           |
      | digital        |
      | categoryA      |
      | category1      |
      | focusRegister  |
      | acrossLibrary  |
      | devicesIn      |
      | TestDEVICEin   |
      | TestNameDevice |
      | confirm        |
      | delete2        |
      | delete2        |
      | delete2        |
      | registerEdit   |
      | acrossLibrary  |
      | devicesIn      |
      | TestDEVICEin   |
      | TestNameDevice |
      | confirm        |
      | severity       |
      | alarmA         |

    And User confirms the selection
      | save |
      | yes  |

    Then User should see success message
      | success | success |
