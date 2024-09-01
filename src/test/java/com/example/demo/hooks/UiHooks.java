package com.example.demo.hooks;

import com.example.demo.utils.ui.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class UiHooks {

    private final BrowserManager browserManager = new BrowserManager();

    @Before
    public void runBeforeEachScenario() {
        browserManager.initializeBrowser();
    }

    @After
    public void runAfterEachScenario() {
        browserManager.closeBrowser();
    }

}
