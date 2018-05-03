package com.smoketests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.RunnerScheduler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class HomepageMostPopularProducts {

    public WebDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://sit.jewson.co.uk/"); //opens the Jewson website//
    }

    @Test
    public void MostPopularProducts() throws Exception

    {




    }

    @After
    public void afterTest() {
        driver.close();
    }

}


