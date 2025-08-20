Feature: Drag Drop Test

  Background:
    Given Navigate to QA Environment
    When Login with PPC user credentials
    And User should accept secure alert
    Then Login should be successfully
    And Change language to English

  Scenario: Drag Drop Test

    And User selects a Station
      | gavdos |

    And User switch to edit mode

    And User clicks following Buttons
      | generalTool |
      | windDrag    |

    And User drag and drop
      | windDrag | blankArea |

    And User right click to reach edit
      | windDrag |
