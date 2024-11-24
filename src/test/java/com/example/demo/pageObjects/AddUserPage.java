package com.example.demo.pageObjects;

import com.example.demo.utils.ui.BrowserManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddUserPage {
    private final Page page = BrowserManager.page;

    public Locator getInputFirstname() {
        return page.locator("input[id='fname']");
    }

    public Locator getInputLastname() {
        return page.locator("input[id='lname']");
    }

    public Locator getInputEmail() {
        return page.locator("input[id='email']");
    }

    public Locator getInputAddress() {
        return page.locator("input[id='address']");
    }

    public Locator getButtonSubmit() {
        return page.getByTestId("submit");
    }

    public Locator getButtonReset() {
        return page.locator("button:has-text('RESET')");
    }

    public Locator getElementSummaryFirstname() {
        return page.locator("label[id='summary-fname']");
    }

    public Locator getElementSummaryLastname() {
        return page.locator("label[id='summary-lname']");
    }

    public Locator getElementSummaryEmail() {
        return page.locator("label[id='summary-email']");
    }

    public Locator getElementSummaryAddress() {
        return page.locator("label[id='summary-address']");
    }
}
