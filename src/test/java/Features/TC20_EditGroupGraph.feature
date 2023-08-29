Feature: Edit Group Graph
  Background:
    Given Navigate to Web Page "http://across.demo.i4.energy/signin"
    When User Enters Email "depan@i4.energy" and Password "Dep@n1234" and Click Button
    Then User Should Login Successfully
#    And Change language to English
#    -> when trying to change language the button place is moving so locator is not finding it.

    Scenario: TC-20 Edit Group Graph and Save

      And User clicks following Buttons
      |splitAirCondition|

      And User switch to edit mode

      And User right click to reach edit
      |blankAreaGraph|

      And User clicks following Buttons
      |newGroup|
