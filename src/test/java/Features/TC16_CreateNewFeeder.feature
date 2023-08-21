Feature: Create Feeders

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English


  @Regression
  Scenario: TC-16 Create a new Feeder

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | feedersMas    |
      | addIcon       |

    And User enters data to necessary areas
      | name        | TestFeeders     |
      | description | TestDescription |

    And User selects necessary areas
      | category   |
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

    Then User should to find the item in field
      | nameContains | TestFeeders |


