package com.qaacademy.tests;

import com.qaacademy.base.BaseTest;
import com.qaacademy.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;


public class FirstBrowserTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {

        HomePage homePage = new HomePage(page);

        homePage.open();

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