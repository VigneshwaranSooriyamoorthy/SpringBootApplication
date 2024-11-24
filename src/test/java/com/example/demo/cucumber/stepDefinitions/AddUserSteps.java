package com.example.demo.cucumber.stepDefinitions;

import com.example.demo.cucumber.DataType.User;
import com.example.demo.pageObjects.AddUserPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AddUserSteps {

    AddUserPage page = new AddUserPage();

    @When("the user enters firstname as {string}")
    public void enterFirstName(String fname) {
        page.getInputFirstname().fill(fname);
    }

    @When("the user enters lastname as {string}")
    public void enterLastName(String lname) {
        page.getInputLastname().fill(lname);
    }

    @When("the user enters email as {string}")
    public void enterEmail(String email) {
        page.getInputEmail().fill(email);
    }

    @When("the user enters address as {string}")
    public void enterAddress(String address) {
        page.getInputAddress().fill(address);
    }

    @When("the user enters user details as below")
    public void enterUserDetails(User user) {
        page.getInputFirstname().fill(user.getFirstName());
        page.getInputLastname().fill(user.getLastName());
        page.getInputEmail().fill(user.getEmail());
        page.getInputAddress().fill(user.getAddress());
    }

    @When("the user press the SUBMIT button")
    public void clickSubmitButton() {
        page.getButtonSubmit().click();
    }

    @When("the user press the RESET button")
    public void clickResetButton() {
        page.getButtonReset().click();
    }

    @Then("the application should display the below user details as a summary")
    public void verifyUserDetailsSummary(DataTable dataTable) {
        dataTable.entries()
                .forEach(data -> {
                    assertThat(page.getElementSummaryFirstname()).hasText(data.get("FirstName"));
                    assertThat(page.getElementSummaryLastname()).hasText(data.get("LastName"));
                    assertThat(page.getElementSummaryEmail()).hasText(data.get("Email"));
                    assertThat(page.getElementSummaryAddress()).hasText(data.get("Address"));
                });
    }

}
