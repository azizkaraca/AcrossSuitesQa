Feature: Json Alarm Import

  Background:
    Given Navigate to DEV Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario Outline: Alarm Import with Json Format in Library Level

    And User clicks following Buttons
      | burgerMenu        |
      | assetsLibraryIcon |
      | <component>       |

    And User search the item
      | search | <item> |

    And User clicks following Buttons
      | arrowButton        |
      | <alarm/event>      |
      | importJson         |
      | importJsonInImport |

    And User choose folder from PC
      | <path> |

    And User confirms the selection
      | confirm |

    Then User should see success message
      | success | success |

    Examples: Tas
      | component | item    | alarm/event         | path                                                                   |
      | tasMas    | testTas | alarmsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-tas.json" |
      | tasMas    | testTas | eventsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-tas.json" |

    Examples: Assets
      | component | item        | alarm/event         | path                                                                     |
      | assetsMas | IMPORT_TEST | alarmsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-asset.json" |
      | assetsMas | IMPORT_TEST | eventsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-asset.json" |

    Examples: Devices
      | component  | item       | alarm/event         | path                                                                      |
      | devicesMas | testDEVICE | alarmsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-device.json" |
      | devicesMas | testDEVICE | eventsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-device.json" |

    Examples: Feeders
      | component  | item       | alarm/event         | path                                                                      |
      | feedersMas | newFeeders | alarmsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-feeder.json" |
      | feedersMas | newFeeders | eventsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-feeder.json" |

    Examples: Capacitors
      | component     | item          | alarm/event         | path                                                                         |
      | capacitorsMas | TestCapacitor | alarmsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-capacitor.json" |
      | capacitorsMas | TestCapacitor | eventsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-capacitor.json" |

    Examples: Interconnectors
      | component       | item                | alarm/event         | path                                                                              |
      | interconnectors | testInterconnectors | alarmsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-interConnector.json" |
      | interconnectors | testInterconnectors | eventsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-interConnector.json" |

    Examples: Pair Interconnectors
      | component           | item                    | alarm/event         | path                                                                                  |
      | pairInterconnectors | testPairInterconnectors | alarmsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-pairInterConnector.json" |
      | pairInterconnectors | testPairInterconnectors | eventsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-pairInterConnector.json" |

    Examples: Internal Consumptions
      | component           | item         | alarm/event         | path                                                                        |
      | internalConsumption | testInternal | alarmsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-internal.json" |
      | internalConsumption | testInternal | eventsInBreadCrumbs | "C:\Users\AzizKaraca\Desktop\alarm-event json\library-alarms-internal.json" |