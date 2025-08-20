Feature: Add Folder

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    And User should accept secure alert
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: TC-14 Add folder from PC

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | unitMas       |

    And User search the item
      | search | test |

    And User clicks following Buttons
      | searchButton |
      | arrowForward |
      | edit         |
      | dropImage    |

    And User choose folder from PC
      | "C:\Users\AzizKaraca\Pictures\TEST.png"|

    And User confirms the selection
      | save |
      | yes  |

    Then User should see success message
      | success | success |




