Feature: Alert Check


  @Regression
  Scenario: TC-19 CapacitorAlert

    Given Navigate to Web Page "https://testpages.herokuapp.com/styled/alerts/alert-test.html"

    And User clicks following Buttons
      | alerttim    |

    And User accept alert



