Feature: Alarm or Event Report Export

  Background:
    Given Navigate to DEV Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: Alarm or Event Report Export in Report Designer

    And User selects a Station
      | skyross |

    And User should wait until url contains
      | view |

    And User clicks following Buttons
      | burgerMenu    |
      | reportsInMenu |

    And User search the item
      | search | test |

    And User clicks following Buttons
      | edit      |
      | discard   |
      | yes       |
      | printIcon |
      | confirm   |

#    And User wait until element clickable to export print
#      | confirm   |
##    bu islem icin wait kisa kaliyor. 20 saniyeden fazla buton donuyor ama wait 20 ye kadar