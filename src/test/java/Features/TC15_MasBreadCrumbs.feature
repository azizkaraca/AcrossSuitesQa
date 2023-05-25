Feature: Asset Breadcrumbs

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "mas@maseurope.com" and Password "ma$_@8miN%" and Click Button
    Then User Should Login Successfully
    And Change language to English


  @Regression
  Scenario Outline: TC-15 Asset Breadcrumbs test in Mas user

    And User clicks following Buttons
      | burgerMenu    |
      | assetsLibrary |
      | assetsMas     |

    And User search the item
      | search | TestAsset |

    And User clicks following Buttons
      | nameContains |
      | arrowButton  |

    And User selects a Breadcrumb
      | <breadcrumbs> |
    Then  User should to be in Correct Url
      | <url> |

    Examples:
      | breadcrumbs     | url             |
      | dashboard       | dashboard       |
      | info            | mainInfo        |
      | units           | units           |
      | devices         | devices         |
      | registers       | registers       |
      | systemRegisters | systemRegisters |
      | graphs          | graphs          |
      | data            | data            |
      | images          | image           |
      | alarms          | alerts          |
      | events          | events          |
      | calculated      | calculated      |
      | remoteControl   | remote          |
      | reports         | reports         |
