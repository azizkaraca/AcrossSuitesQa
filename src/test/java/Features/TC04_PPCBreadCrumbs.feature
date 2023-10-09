Feature: Breadcrumbs Test

  Background:
    Given Navigate to QA Environment
    When Login with PPC user credentials
    Then Login should be successfully
    And Change language to English

  @Regression
  Scenario Outline: TC-04 Breadcrumbs Test
    And User selects a Station
      | gavdos |
    And User selects a Generator
      | gen1 |
    And User selects a Breadcrumb
      | <breadcrumbs> |
    Then  User should to be in Correct Url
      | <url> |

    Examples:
      | breadcrumbs     | url             |
      | dashboard2      | dashboard       |
      | alarms          | alarms          |
      | events          | events          |
      | data            | data            |
      | graphs          | graphs          |
      | info            | mainInfo        |
      | availability    | availability    |
      | devices2        | devices         |
      | units2          | units           |
      | registers       | registers       |
      | systemRegisters | systemRegisters |
      #| process         | process         |
      | images          | image           |
      | specifications  | specifications  |
      | aggregations    | aggregations    |
      | remoteControl   | remote          |
      | reports2        | reports         |
      | calculated      | Calculated      |
