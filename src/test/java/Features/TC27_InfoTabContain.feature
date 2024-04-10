Feature: Info Tab Data Check

  Background: Preconditions
    Given Navigate to PROD Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario: Assets Generators Info Tab Values
    And User selects a Station
      | gavdos |

    And User should wait until url contains
      | view |

    And User clicks following Buttons
      | burgerMenu                |
      | management                |
      | infrastructure            |
      | assetsUnderInfrastructure |
      | Gen02                     |
      | info                      |

    And User verify the necessary element is displayed
      | infoName |

    And User switch to mode from "view" to "edit"
    And User switch to mode from "edit" to "view"

    And User verify the necessary element is displayed
      | infoName |





