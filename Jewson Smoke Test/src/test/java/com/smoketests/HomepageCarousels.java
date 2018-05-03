package com.smoketests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class HomepageCarousels {

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
    public void testcarousels() throws Exception {

        //1st component on the carousel - Building Better Communities
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'1')]")).click();
        driver.findElement(By.xpath("//img[@alt='BBC Banner']")).click();
        Thread.sleep(3000);
        Set<String> st= driver.getWindowHandles();
        Iterator<String> it = st.iterator();
        String parent =  it.next();
        String child =it.next();
        // switch to child
        driver.switchTo().window(child);
        Thread.sleep(3000);
        String URL = driver.getCurrentUrl();
        assertEquals(URL, "https://www.buildingbettercommunities.co.uk/" );
        System.out.println("Selected URL = https://www.buildingbettercommunities.co.uk/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //1st component on the carousel - Building Better Communities - Find Out More link
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'1')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Find out more...')])[2]")).click();
        Thread.sleep(3000);
        Set<String> sta = driver.getWindowHandles();
        Iterator<String> ita = sta.iterator();
        String parenta =  ita.next();
        String childa =ita.next();
        // switch to child
        driver.switchTo().window(childa);
        Thread.sleep(3000);
        String URLa = driver.getCurrentUrl();
        assertEquals(URLa, "https://www.buildingbettercommunities.co.uk/" );
        System.out.println("Find Out More - Selected URL = https://www.buildingbettercommunities.co.uk/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parenta);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //2nd component on the carousel - Build Aviator
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'2')]")).click();
        driver.findElement(By.xpath("//img[@alt='Build Aviator']")).click();
        Thread.sleep(3000);
        Set<String> st1= driver.getWindowHandles();
        Iterator<String> it1 = st1.iterator();
        String parent1 =  it1.next();
        String child1 =it1.next();
        // switch to child
        driver.switchTo().window(child1);
        Thread.sleep(3000);
        String URL1 = driver.getCurrentUrl();
        assertEquals(URL1, "https://sit.jewson.co.uk/buildaviator/" );
        System.out.println("Selected URL = https://sit.jewson.co.uk/buildaviator/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent1);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //2nd component on the carousel - Build Aviator - Find out more link
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'2')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Find out more...')])[3]")).click();
        Thread.sleep(3000);
        Set<String> st1b= driver.getWindowHandles();
        Iterator<String> it1b = st1b.iterator();
        String parent1b =  it1b.next();
        String child1b =it1b.next();
        // switch to child
        driver.switchTo().window(child1b);
        Thread.sleep(3000);
        String URL1b = driver.getCurrentUrl();
        assertEquals(URL1b, "https://sit.jewson.co.uk/buildaviator/" );
        System.out.println("Find Out More - Selected URL = https://sit.jewson.co.uk/buildaviator/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent1b);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //3rd component on the carousel - Juice
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'3')]")).click();
        driver.findElement(By.xpath("//img[@alt='Juice Rewards']")).click();
        Thread.sleep(3000);
        Set<String> st2= driver.getWindowHandles();
        Iterator<String> it2 = st2.iterator();
        String parent2 =  it2.next();
        String child2 =it2.next();
        // switch to child
        driver.switchTo().window(child2);
        Thread.sleep(3000);
        String URL2 = driver.getCurrentUrl();
        assertEquals(URL2, "https://sit.jewson.co.uk/accounts/juice-by-jewson/" );
        System.out.println("Selected URL = https://sit.jewson.co.uk/accounts/juice-by-jewson/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent2);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //3rd component on the carousel - Juice - Find out more link
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'3')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Find out more...')])[4]")).click();
        Thread.sleep(3000);
        Set<String> st2c= driver.getWindowHandles();
        Iterator<String> it2c = st2c.iterator();
        String parent2c =  it2c.next();
        String child2c =it2c.next();
        // switch to child
        driver.switchTo().window(child2c);
        Thread.sleep(3000);
        String URL2c = driver.getCurrentUrl();
        assertEquals(URL2c, "https://sit.jewson.co.uk/accounts/juice-by-jewson/" );
        System.out.println("Find Out More - Selected URL = https://sit.jewson.co.uk/accounts/juice-by-jewson/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent2c);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //4th component on the carousel - Kitchen and Bathroom Sales
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'4')]")).click();
        driver.findElement(By.xpath("//img[@alt='Kitchens Website']")).click();
        Thread.sleep(3000);
        Set<String> st3= driver.getWindowHandles();
        Iterator<String> it3 = st3.iterator();
        String parent3 =  it3.next();
        String child3 =it3.next();
        // switch to child
        driver.switchTo().window(child3);
        Thread.sleep(3000);
        String URL3 = driver.getCurrentUrl();
        assertEquals(URL3, "https://www.jewsonkitchens.co.uk/deals" );
        System.out.println("Selected URL = https://www.jewsonkitchens.co.uk/deals");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent3);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //4th component on the carousel - Kitchen and Bathroom Sales - Find out more link
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'4')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Find out more...')])[5]")).click();
        Thread.sleep(3000);
        Set<String> st3d= driver.getWindowHandles();
        Iterator<String> it3d = st3d.iterator();
        String parent3d =  it3d.next();
        String child3d =it3d.next();
        // switch to child
        driver.switchTo().window(child3d);
        Thread.sleep(3000);
        String URL3d = driver.getCurrentUrl();
        assertEquals(URL3d, "https://www.jewsonkitchens.co.uk/deals" );
        System.out.println("Find Out More - Selected URL = https://www.jewsonkitchens.co.uk/deals");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent3d);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //5th component on the carousel - Tool Hire Guide
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'5')]")).click();
        driver.findElement(By.xpath("//img[@alt='Tool Hire Guide']")).click();
        Thread.sleep(3000);
        Set<String> st4= driver.getWindowHandles();
        Iterator<String> it4 = st4.iterator();
        String parent4 =  it4.next();
        String child4 =it4.next();
        // switch to child
        driver.switchTo().window(child4);
        Thread.sleep(3000);
        String URL4 = driver.getCurrentUrl();
        assertEquals(URL4, "http://easyflip.co.uk/Jewson_tool_hire_2018/" );
        System.out.println("Selected URL = http://easyflip.co.uk/Jewson_tool_hire_2018/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent4);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //5th component on the carousel - Tool Hire Guide - Find out more link
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("//button[@type='button'][contains(text(),'5')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Find out more...')])[6]")).click();
        Thread.sleep(3000);
        Set<String> st4e= driver.getWindowHandles();
        Iterator<String> it4e = st4e.iterator();
        String parent4e =  it4e.next();
        String child4e =it4e.next();
        // switch to child
        driver.switchTo().window(child4e);
        Thread.sleep(3000);
        String URL4e = driver.getCurrentUrl();
        assertEquals(URL4e, "http://easyflip.co.uk/Jewson_tool_hire_2018/" );
        System.out.println("Find Out More - Selected URL = http://easyflip.co.uk/Jewson_tool_hire_2018/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent4e);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //6th component on the carousel - Tool Hire Online
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        driver.findElement(By.xpath("(//img[@alt='Tool Hire 30%'])[2]")).click();
         Thread.sleep(3000);
        Set<String> st5= driver.getWindowHandles();
        Iterator<String> it5 = st5.iterator();
        String parent5 =  it5.next();
        String child5 =it5.next();
        // switch to child
        driver.switchTo().window(child5);
        Thread.sleep(3000);
        String URL5 = driver.getCurrentUrl();
        assertEquals(URL5, "https://sit.jewson.co.uk/tool-hire/" );
        System.out.println("Selected URL = https://sit.jewson.co.uk/tool-hire/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent5);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

        //6th component on the carousel - Tool Hire Online - Find out more link
        driver.findElement(By.xpath("//ul[@class='slick-carousel-items js-slick-carousel no-list-style slick-initialized slick-slider']//div[@aria-live='polite']//div[@class='slick-track']"));
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Find out more...')])[7]")).click();
        Thread.sleep(3000);
        Set<String> st5f= driver.getWindowHandles();
        Iterator<String> it5f = st5f.iterator();
        String parent5f =  it5f.next();
        String child5f =it5f.next();
        // switch to child
        driver.switchTo().window(child5f);
        Thread.sleep(3000);
        String URL5f = driver.getCurrentUrl();
        assertEquals(URL5f, "https://sit.jewson.co.uk/tool-hire/" );
        System.out.println("Find Out More - Selected URL = https://sit.jewson.co.uk/tool-hire/");
        driver.close();
        //switch to parent
        driver.switchTo().window(parent5f);
        System.out.println("Returned to Homepage");
        Thread.sleep(7000);

    }

    @After
    public void afterTest() {

        driver.close();
    }

}
