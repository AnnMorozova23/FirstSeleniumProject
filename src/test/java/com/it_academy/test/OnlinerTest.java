package com.it_academy.test;

import com.it_academy.onliner.pageobject.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerTest {
    private HomePage homePage = new HomePage();

    @BeforeClass
    public void navigateToOnlinerPage() {
        homePage.navigate("https://www.onliner.by/");
    }

    @Test
    public void testOnlinerBrowserTitle() {
        System.out.println("Hi");
    }

    @AfterClass
    public void closeBrowser() {
        homePage.closeBrowser();
    }
}
