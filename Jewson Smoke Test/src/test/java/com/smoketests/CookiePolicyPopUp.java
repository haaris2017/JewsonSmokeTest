package com.smoketests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class CookiePolicyPopUp {

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
    public void cookiePolicy() throws Exception {

        driver.get("https://sit.jewson.co.uk/");
        driver.findElement(By.xpath("//div[@id='ccc-icon']/button")).click();
        Thread.sleep(1000);
        assertEquals("Cookie Control", driver.findElement(By.xpath("//div[@id='ccc-state']/div[2]/div/div/h2")).getText(),"Cookie Control");
        driver.findElement(By.xpath("//div[@id='ccc-state']/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("www.jewson.co.uk")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ccc-icon']/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ccc-state']/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Cookie Policy")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ccc-icon']/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ccc-state']/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("about this tool")).click();
        Thread.sleep(3000);
        Set<String> st= driver.getWindowHandles();
        Iterator<String> it = st.iterator();
        String parent =  it.next();
        String child =it.next();
        // switch to child
        driver.switchTo().window(child);
        Thread.sleep(3000);
        String URL = driver.getCurrentUrl();
        assertEquals(URL, "https://www.civicuk.com/cookie-control" );
        System.out.println("Selected URL via about this tool text: https://www.civicuk.com/cookie-control");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent);
        System.out.println("Returned to Jewson");
        Thread.sleep(3000);

        driver.findElement(By.linkText("About Cookie Control")).click();
        Thread.sleep(3000);
        Set<String> st1= driver.getWindowHandles();
        Iterator<String> it1 = st1.iterator();
        String parent1 =  it1.next();
        String child1 =it1.next();
        // switch to child
        driver.switchTo().window(child1);
        Thread.sleep(3000);
        String URL1 = driver.getCurrentUrl();
        assertEquals(URL1, "https://www.civicuk.com/cookie-control" );
        System.out.println("Selected URL via 'C' icon: https://www.civicuk.com/cookie-control");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent1);
        System.out.println("Returned to Jewson");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='ccc-state']/div[2]/div/div/div/button")).click();

    }

    @After
    public void afterTest() {
        driver.close();
    }

}


