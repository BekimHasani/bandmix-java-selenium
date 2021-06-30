package com;

import com.initialize.InitializeUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenBrowser {
    InitializeUser browser = new InitializeUser();
    public WebDriver element;

    @BeforeMethod
    public void openChrome(){
        element = browser.initializeInstance();

        element.get("https://www.bandmix.com/");

        System.out.println("------- Opening Browser -------");
    }

    @AfterMethod
    public void cleanUp()
    {
        element.quit();
    }

}
