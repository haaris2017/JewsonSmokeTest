package com.smoketests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class Header {

    public WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://sit.jewson.co.uk/"); //opens the Jewson website//
    }

    @Test
    public void testHeader() throws Exception {
        driver.get("https://sit.jewson.co.uk/");
        try {
            assertEquals("Builders Merchant | Materials, Supplies & Tools | Jewson | Jewson", driver.getTitle());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Jewson", driver.findElement(By.linkText("Jewson")).getText(), "Jewson");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("About Us", driver.findElement(By.linkText("About Us")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Working With You", driver.findElement(By.linkText("Working With You")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Accounts", driver.findElement(By.linkText("Accounts")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Careers", driver.findElement(By.linkText("Careers")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Contact Us", driver.findElement(By.linkText("Contact Us")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Branch Locator", driver.findElement(By.linkText("Branch Locator")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("My List - (0 items)", driver.findElement(By.xpath("//div[@id='MyAccount']/p/a/span[2]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Search", driver.findElement(By.id("ctl00_ctl00_SearchForm_4_SubmitBtn")).getAttribute("value"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Search for product or code", driver.findElement(By.id("SearchForm_4_KeywordsTxt")).getAttribute("value"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Login", driver.findElement(By.linkText("Login")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Register", driver.findElement(By.linkText("Register")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Home", driver.findElement(By.xpath("//a[contains(text(),'Home')]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Builders Merchant | Materials, Supplies & Tools | Jewson | Jewson", driver.getTitle());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Roofing & Ventilation", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[2]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Tool Hire", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[3]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Building Materials", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[4]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Kitchens & Bathrooms", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[5]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Windows, Doors & Joinery", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[6]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Decorating", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[7]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Tools, Fixings & Ironmongery", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[8]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Electricals, Plumbing & Heating", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[9]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Timber", driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[10]/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    /*@After
    public void afterTest() {
        driver.close();
    }*/

}
