Feature: Add a new user

  Background: 
    Given the user navigates to 'http://localhost:8080/webpage/demo.html'

  @Test
  Scenario: Happy flow - Add a new user - Cucumber DataTable
    When the user enters firstname as "Stephen"
    * the user enters lastname as "Hawkins"
    * the user enters email as "stephen.hawkins@gmail.com"
    * the user enters address as "England"
    * the user press the SUBMIT button
    Then the application should display the below user details as a summary
      | FirstName | LastName | Email                     | Address |
      | Stephen   | Hawkins  | stephen.hawkins@gmail.com | England |

  @Test
  Scenario: Happy flow - Add a new user - Cucumber DataTable Transformation
    When the user enters user details as below
      | FirstName | LastName | Email                     | Address |
      | Stephen   | Hawkins  | stephen.hawkins@gmail.com | England |
    * the user press the SUBMIT button
    Then the application should display the below user details as a summary
      | FirstName | LastName | Email                     | Address |
      | Stephen   | Hawkins  | stephen.hawkins@gmail.com | England |
