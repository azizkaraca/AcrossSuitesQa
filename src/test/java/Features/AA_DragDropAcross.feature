Feature: Drag Drop Test

  Background:
    Given Navigate to DEV Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  Scenario: Drag Drop Test

    And User selects a Station
      | gavdos |

    And User switch to edit mode

    And User clicks following Buttons
      | generalTool |
      | windDrag    |
      | blankArea   |

    And User drag and drop
      | windDrag | blankArea |

#    And User right click to reach edit
#      | buttonOn |
