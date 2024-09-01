package com.example.demo.cucumber.stepDefinitions;

import com.example.demo.pageObjects.WelcomePage;
import io.cucumber.java.en.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class WelcomePageSteps {

    WelcomePage welcomePage = new WelcomePage();

    @Then("the welcome page should open")
    public void welcomePageShouldOpen() {
        assertThat(welcomePage.getElementTitle()).hasText("Hello, this is the Spring Boot welcome page");
    }

    @Then("the welcome page title {string} should be displayed")
    public void verifyPageTitle(String title) {
        assertThat(welcomePage.getElementTitle()).hasText(title);
    }

    @And("below message should be displayed on welcome page")
    public void belowMessageShouldBeDisplayed(String message) {
        assertThat(welcomePage.getElementsMessage()).hasText(message.split("\n"));
    }

}
