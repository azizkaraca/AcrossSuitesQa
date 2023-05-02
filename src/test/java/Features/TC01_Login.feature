Feature: Login Functionality

  Background:
    Given Navigate to Web Page

  @SmokeTest
  Scenario Outline: TC-01 Login with valid username and valid password
    When User Enters Email "<Email>" and Password "<Password>" and Click Button
    Then User Should Login Successfully

    Examples:
      | Email             | Password   |
      | ppc@maseurope.com | Ppc123456! |
     # | mas@maseurope.com | ma$_@8miN% |



