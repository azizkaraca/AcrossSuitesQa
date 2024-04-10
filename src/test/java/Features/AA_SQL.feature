Feature: SQL query check

  Background:
    Given Navigate to DEV Environment
    When Login with MAS user credentials
    Then Login should be successfully
    And Change language to English


  Scenario: Devices control with JDBC
    And User clicks following Buttons
#      | burgerMenu    |
      | assetsLibraryIcon |
      | devicesMas    |

    And Send The query to the database "SELECT id, model FROM ACROSS_DB.library_device" and control match