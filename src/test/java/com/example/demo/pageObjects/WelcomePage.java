package com.example.demo.pageObjects;

import com.example.demo.utils.ui.BrowserManager;
import com.microsoft.playwright.*;

import java.util.List;

public class WelcomePage {

    private final Page page = BrowserManager.page;

    public Locator getElementTitle() {
        return page.locator("h1");
    }

    public Locator getElementsMessage() {
        return page.locator("h3");
    }

    public List<String> getAllMessages() {
        return getElementsMessage().allTextContents();
    }

}
