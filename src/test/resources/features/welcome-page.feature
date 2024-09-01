Feature: 

  Background:
     Given the user navigates to 'http://localhost:8080/'

  @Test
  Scenario: Access welcome page
    Then the welcome page should open

  Scenario: Validate welcome page message
    Then the welcome page title 'Hello, this is the Spring Boot welcome page' should be displayed
    And below message should be displayed on welcome page
      """
      Source file is located at src\main\resources\static\index.html
      You will be automatically redirected to the application webpage in N seconds
      You can also skip the wait time by clicking here
      """
