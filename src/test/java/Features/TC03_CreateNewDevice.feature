Feature: Devices Creation

  Background:
    Given Navigate to Web Page
    When User Enters Email "ppc@maseurope.com" and Password "Ppc123456!" and Click Button
    Then User Should Login Successfully
    And Change language to English

  @Regression
  Scenario: TC-03 Create a new Device

    And User chooses an Island
      | gavdos |
    And User chooses a Generator
      | gen1 |
    And User goes to Main Menu
      | burgerMenu |
    And User goes to Management
      | management |
    And User goes to InfraStructure
      | infrastructure |
    And User goes to Devices
      | devices |
    Then User should to see created device in Devices Area
      | devicesTest | TEST |




