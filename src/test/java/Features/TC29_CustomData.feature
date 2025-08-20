Feature: Custom Data Template

  Background:
    Given Navigate to Web Page "http://version3.demo.i4.energy/signin"
    When User Enters Email "demo@maseurope.com" and Password "Dem@1234" and Click Button

    Scenario: TC-29 Take the list of Custom Data Template
      And User clicks following Buttons
        | Templates          |
        | customDataTemplate |

      And User Takes the all created Custom Data Template Name lists

      Then Assert that "Dates" in the List
