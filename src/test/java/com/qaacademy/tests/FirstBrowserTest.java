package com.qaacademy.tests;

import com.qaacademy.base.BaseTest;
import org.testng.annotations.Test;

public class FirstBrowserTest extends BaseTest {

    @Test
    public void openBrowser() {

        page.navigate("https://automationexercise.com");

        page.waitForTimeout(5000);
    }
}