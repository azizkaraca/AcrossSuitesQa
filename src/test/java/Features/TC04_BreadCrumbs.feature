Feature: Breadcrumbs Test

  Background:
    Given Navigate to Web Page
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario Outline: TC-05 Breadcrumbs Test
    And User selects an Island
      | gavdos |
    And User selects a Generator
      | gen1 |
    And User selects a Breadcrumb
      | <breadcrumbs> |
    Then  User should to be in Correct Url
      | <url> |

    Examples:
      | breadcrumbs     | url             |
      | dashboard       | dashboard       |
      | alarms          | alarms          |
      | events          | events          |
      | data            | data            |
      | graphs          | graphs          |
      | info            | info            |
      | availability    | maintenance     |
      | devices         | devices         |
      | units           | units           |
      | registers       | registers       |
      | systemRegisters | systemRegisters |
      | process         | process         |
      | images          | image           |
      | specifications  | specifications  |
      | aggregations    | aggregations    |
      | remoteControl   | remote          |
      | reports         | reports         |
