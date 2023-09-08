Feature: Logout Functionality

  Background:
    Given Navigate to QA Environment

  @SmokeTest
  Scenario Outline: TC-02 Logout from Web Application

    When User Enters Email "<Email>" and Password "<Password>" and Click Button
    Then Login should be successfully
    And Change language to English
    And Go to MyAccount
    And Click Logout Button
    Then User Should Logout Successfully

    Examples:
      | Email             | Password   |
      | ppc@maseurope.com | Ppc123456! |
      | mas@maseurope.com | ma$_@8miN% |
