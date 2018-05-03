package com.smoketests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import jxl.*;
import java.io.File;
import java.io.FileInputStream;

public class NumberPlusOne {
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
        driver.get("https://uat.jewson.co.uk/"); //opens the Jewson website//

    }

    @Test
    public void testLogIn() throws Exception {

        FileInputStream fi = new FileInputStream("C:\\Users\\C0198379\\Desktop\\Jewson Responsive\\Jewson Automation\\JewsonOrderReferenceNumber.xls");
        Workbook w = Workbook.getWorkbook(fi);
        Sheet s = w.getSheet("Sheet1");

        for(int i=1;i<=s.getRows();i++)
        {
            driver.findElement(By.linkText("Login")).click(); //clicks login from the top navigation
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'fancybox-frame')]"))); //Switches the script to the login window
            driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Username")).clear(); //clears the username field
            driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Username")).sendKeys(s.getCell("A"+i).getContents()); //enters the username
        }
    }

    //@After
    //public void afterTest() {
    //   driver.close();
    //}

}