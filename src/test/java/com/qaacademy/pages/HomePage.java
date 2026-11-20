
package com.qaacademy.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.WaitForSelectorState;

public class HomePage {
    private final Locator homeLink;

    private final Page page;

    public HomePage(Page page) {
        this.page = page;
        this.homeLink = page.getByRole(
                AriaRole.LINK,
                new Page.GetByRoleOptions().setName("Home")
        );
    }

    public void open() {
        page.navigate("https://automationexercise.com");
    }

    public String getPageTitle() {
        return page.title();
    }

    public boolean isHomeLinkVisible() {
        return homeLink.isVisible();
    }

    public void waitForHomeLink() {
        homeLink.waitFor(
                new Locator.WaitForOptions()
                        .setState(WaitForSelectorState.VISIBLE)
        );
    }
}
