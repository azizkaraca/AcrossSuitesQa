Feature: Timestamp in Blockly (VCD)

  Background: Login process
    Given Navigate to DEV Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  Scenario: Timestamp functionality in VCD
    And User selects a Station
      | gaydos |

    And User should wait until url contains
      | view |

    And User switch to edit mode

    And User clicks following Buttons
      | valueTool    |

    And User drag and drop
      | complexValue | blankArea |

    And User right click to reach edit
      | complexValueIn |

    And User clicks following Buttons
      | edit            |
      | editCheckedRule |
      | timeBlockly     |
      | seconds         |

