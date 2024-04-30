Feature: Login Functionality

  Background:
    Given Navigate to QA Environment

  @SmokeTest
#  Scenario Outline: TC-01 Login with valid username and valid password
    Scenario: TC-01 Login with valid username and valid password
#    When User Enters Email "<Email>" and Password "<Password>" and Click Button
    When Login with MAS user credentials
    Then Login should be successfully

#    Examples:
#      | Email             | Password   |
#      | ppc@maseurope.com | Ppc123456! |
#      | mas@maseurope.com | ma$_@8miN% |



