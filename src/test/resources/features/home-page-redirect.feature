Feature: Home page redirect

    Background:
        Given the user navigates to 'http://localhost:8080/'

    Scenario: Verify automatic page redirect
        When the user waits for 10 seconds
        Then the user should be automatically redirected to 'http://localhost:8080/webpage/demo.html'