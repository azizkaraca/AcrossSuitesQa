Feature: Breadcrumbs Test

  Background:
    Given Navigate to Web Page "http://10.10.10.79:31193/signin"
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
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
      | dashboard       | dashboard       |
      | alarms          | alarms          |
      | events          | events          |
      | data            | data            |
      | graphs          | graphs          |
      | info            | mainInfo        |
      | availability    | availability    |
      | devices         | devices         |
      | units           | units           |
      | registers       | registers       |
      | systemRegisters | systemRegisters |
      #| process         | process         |
      | images          | image           |
      | specifications  | specifications  |
      | aggregations    | aggregations    |
      | remoteControl   | remote          |
      | reports         | reports         |
