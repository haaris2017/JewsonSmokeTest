package com.smoketests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class FeedbackTool {

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
    public void feedbackTool() throws Exception{

        driver.findElement(By.xpath("//div[@id='fby-tab-5772']/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("or Cancel")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='fby-tab-5772']/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("10")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Enter your details and further comments")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("feedback-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("feedback-text")).clear();
        driver.findElement(By.id("feedback-text")).sendKeys("The Jewson website is lovely.");
        driver.findElement(By.xpath("//table[@id='fby-form']/tbody/tr[4]/td[2]/div/div[2]/div[2]/div/a/div[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("femail")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("femail")).clear();
        driver.findElement(By.name("femail")).sendKeys("christopher.hoole@sgbd.co.uk");
        driver.findElement(By.xpath("//table[@id='fby-form']/tbody/tr[4]/td[2]/div/div[2]/div[2]/div/a/div[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='fby-form']/tbody/tr[4]/td[2]/div/div[2]/div[2]/div/a/div[3]")).click();

        driver.findElement(By.xpath("//div[@id='fby-tab-5772']/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("10")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Enter your details and further comments")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("feedback-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("feedback-text")).clear();
        driver.findElement(By.id("feedback-text")).sendKeys("The Jewson website is lovely.");
        driver.findElement(By.xpath("//table[@id='fby-form']/tbody/tr[4]/td[2]/div/div[2]/div[2]/div/a/div[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Submit without my email and close")).click();

    }

    @After
    public void afterTest() {
        driver.close();
    }

}


