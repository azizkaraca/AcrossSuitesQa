Feature: Add Folder

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: TC-14 Add folder from PC

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | unitMas       |

    And User search the item
      | search | TestUNIT |

    And User clicks following Buttons
      | arrowButton |
      | edit        |
      | dropImage   |

    And User choose folder from PC
      | TEST |

    And User confirms the selection
      | save |
      | yes  |




