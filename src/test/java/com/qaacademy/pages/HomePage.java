
package com.qaacademy.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.WaitForSelectorState;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage  extends BasePage {
    private final Locator homeLink;

    public HomePage(Page page) {
        super(page);

        this.homeLink = page.getByRole(
                AriaRole.LINK,
                new Page.GetByRoleOptions().setName("Home")
        );
    }
    HomePage homePage = new HomePage(page);


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

    public void assertHomeLinkIsVisible() {
        assertThat(homeLink).isVisible();
    }
}
