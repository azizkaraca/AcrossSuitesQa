Feature: Drag Drop Test

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
    And Change language to English

  Scenario: Drag Drop Test

    And User selects a Station
      | gavdos |

    And User switch to edit mode

    And User clicks following Buttons
      | generalTool |
      | blankArea   |

    And User drag and drop
      | buttonDrag | blankArea |

    And User right click to reach edit
      | buttonOn |
