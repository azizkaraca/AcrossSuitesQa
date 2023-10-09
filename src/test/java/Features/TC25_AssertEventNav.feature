Feature: Assertion of Event Navigation

  Background:
    Given Navigate to DEV Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario Outline: Events Should Navigate to Correct area

    And User clicks following Buttons
      | burgerMenu        |
      | assetsLibraryIcon |
      | <component>       |

    And User search the item
      | search | <item> |

    And User clicks following Buttons
      | arrowButton   |
      | <alarm/event> |

    And User search the item
      | search | <name> |

    And User clicks following Buttons
      | arrowButton |

    Then User verify the navigated area is correct
      | inputName |

    Examples: Tas
      | component | item    | alarm/event         | name   |
      | tasMas    | testTas | alarmsInBreadCrumbs | test11 |
      | tasMas    | testTas | eventsInBreadCrumbs | test11 |

    Examples: Assets
      | component | item        | alarm/event         | name   |
      | assetsMas | IMPORT_TEST | alarmsInBreadCrumbs | test11 |
      | assetsMas | IMPORT_TEST | eventsInBreadCrumbs | test11 |

    Examples: Devices
      | component  | item       | alarm/event         | name   |
      | devicesMas | testDEVICE | alarmsInBreadCrumbs | test11 |
      | devicesMas | testDEVICE | eventsInBreadCrumbs | test11 |

    Examples: Feeders
      | component  | item       | alarm/event         | name   |
      | feedersMas | newFeeders | alarmsInBreadCrumbs | test11 |
      | feedersMas | newFeeders | eventsInBreadCrumbs | test11 |

    Examples: Capacitors
      | component     | item          | alarm/event         | name   |
      | capacitorsMas | TestCapacitor | alarmsInBreadCrumbs | test11 |
      | capacitorsMas | TestCapacitor | eventsInBreadCrumbs | test11 |

    Examples: Interconnectors
      | component       | item                | alarm/event         | name   |
      | interconnectors | testInterconnectors | alarmsInBreadCrumbs | test11 |
      | interconnectors | testInterconnectors | eventsInBreadCrumbs | test11 |

    Examples: Pair Interconnectors
      | component           | item                    | alarm/event         | name   |
      | pairInterconnectors | testPairInterconnectors | alarmsInBreadCrumbs | test11 |
      | pairInterconnectors | testPairInterconnectors | eventsInBreadCrumbs | test11 |

    Examples: Internal Consumptions
      | component           | item         | alarm/event         | name   |
      | internalConsumption | testInternal | alarmsInBreadCrumbs | test11 |
      | internalConsumption | testInternal | eventsInBreadCrumbs | test11 |