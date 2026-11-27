package com.qaacademy.tests;

import com.qaacademy.base.BaseTest;
import com.qaacademy.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class FirstBrowserTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {

        HomePage homePage = new HomePage(page);

        homePage.open();

        homePage.isHomeLinkVisible();

        homePage.waitForHomeLink();

        String actualTitle = homePage.getPageTitle();


        Assert.assertEquals(
                actualTitle,
                "Automation Exercise",
                "Homepage title is incorrect!"
        );

        Assert.assertTrue(
                homePage.isHomeLinkVisible(),
                "Home link is not visible!"
        );
    }
}