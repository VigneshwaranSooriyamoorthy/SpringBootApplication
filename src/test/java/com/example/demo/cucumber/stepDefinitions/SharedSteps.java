package com.example.demo.cucumber.stepDefinitions;

import com.example.demo.utils.ui.BrowserManager;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class SharedSteps {

    private final Page page = BrowserManager.page;

    @Given("the user navigates to {string}")
    public void pageNavigation(String baseUrl) {
        page.navigate(baseUrl);
    }

    @When("the user waits for {int} seconds")
    public void theUserWaitsForSeconds(int timeInSeconds) throws InterruptedException {
        page.wait(timeInSeconds * 1000L);
    }

    @Then("the user should be automatically redirected to {string}")
    public void verifyTheRedirectURL(String redirectUrl) {
        assertThat(page).hasURL(redirectUrl);
    }
}
