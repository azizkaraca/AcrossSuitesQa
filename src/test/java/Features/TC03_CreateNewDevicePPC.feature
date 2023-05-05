Feature: Devices Creation

  Background:
    Given Navigate to Web Page
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-03 Create a new Device

    And User selects an Island
      | gavdos |
    And User selects a Generator
      | gen1 |
    And User clicks following Buttons
      | burgerMenu     |
      | management     |
      | infrastructure |
      | devices        |
      | addButton      |
      | solarPanel     |
    And User press the Tab Button on Keyboard Times
      | 2 |
    And User press the Enter Button on Keyboard Times
      | 3 |
    When User confirms the selection
      | confirm |
      | yes |
    Then User should to find created device in Devices Area
      | solarPanel | Solar |




