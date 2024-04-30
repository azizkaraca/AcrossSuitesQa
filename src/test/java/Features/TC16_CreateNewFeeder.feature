Feature: Create Feeders

  Background:
    Given Navigate to QA Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English


  @Regression
  Scenario: TC-16 Create a new Feeder

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | feedersMas    |
      | newAdd        |

    And User enters data to necessary areas
      | name        | TestFeeders     |
      | description | TestDescription |

    And User selects necessary areas
      | pencilIcon   |
      | engine     |
      | heatEngine |
      | confirm    |

    And User confirms the selection
      | save |
      | yes  |

    And User goes to Feeders
      | feeders |

    And User search the item
      | search | TestFeeders |

    And User clicks following Buttons
      | searchButton |

    Then User should to find the item in field
      | nameContains | TestFeeders |


