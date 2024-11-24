package com.example.demo.utils.ui;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserManager {

    private Playwright playwright;
    private Browser browser;
    private BrowserContext browserContext;
    public static Page page;

    public void initializeBrowser() {
        playwright = Playwright.create();
        playwright.selectors().setTestIdAttribute("data-test-id");
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
        );
        browserContext = browser.newContext();
        page = browserContext.newPage();
    }

    public void closeBrowser() {
        page.close();
        browserContext.close();
        browser.close();
        playwright.close();
    }

}
