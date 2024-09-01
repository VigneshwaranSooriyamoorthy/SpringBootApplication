package com.example.demo.pageObjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomePage {

    private Page page;

    public Locator getElementTitle() {
        return page.locator("h1");
    }

}
