package com.automation.smoke;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.URL;

import static org.testng.Assert.assertTrue;

/**
 * Unit smoke for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

  /*  @BeforeSuite
    public void setUp() throws InterruptedException {
        System.out.println("App test - This is set up");
        System.setProperty("webdriver.chrome.driver","F:\\ULC-E2E-Automation\\node_modules\\protractor\\node_modules\\webdriver-manager\\selenium\\chromedriver_2.26.exe");
        WebDriver d= new ChromeDriver();
        d.get("https://www.google.com");
        Thread.sleep(5000);


    }*/

    @BeforeSuite
    public void setUp() throws InterruptedException {
        System.out.println("App test - This is set up");
        System.setProperty("webdriver.chrome.driver","F:\\ULC-E2E-Automation\\node_modules\\protractor\\node_modules\\webdriver-manager\\selenium\\chromedriver_2.26.exe");
        WebDriver d= new ChromeDriver();

       // RemoteWebDriver rem= new RemoteWebDriver(new URL(''),driver);
        d.get("https://www.google.com");
        Thread.sleep(5000);


    }

    @Test(priority = 1)
    public void uiTest()
    {
        System.out.println("App Test - This is selenium UI smoke");
    }

    @Test(priority = 2)
    public void appiumTest(){
        System.out.println("App Test - This is appium smoke");
    }

    @AfterSuite
    public void testDown(){
        System.out.println("App test - This is tear down");
    }

}
