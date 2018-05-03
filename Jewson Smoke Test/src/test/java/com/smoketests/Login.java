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

public class Login {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://sit.jewson.co.uk/");//Opens Jewson website
    }

    @Test
    public void testLogIn() throws Exception {
        driver.findElement(By.linkText("Login")).click(); //clicks login from the top navigation
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'fancybox-frame')]"))); //Switches the script to the login window
        driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Username")).clear(); //clears the username field
        driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Username")).sendKeys("webteam"); //enters the username
        driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Password")).clear(); //clears the password field
        driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Password")).sendKeys("c0v3ntry019"); //enters the password
        driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_LoginButton")).click(); //clicks the login button
        driver.switchTo().parentFrame(); //switches back to the parent frame (Header)

        if (driver.getPageSource().contains("My Account")) {
            System.out.println("Login Successful");
        } else System.out.println("Login unsuccessful");

        try {
            assertEquals("My Account", driver.findElement(By.linkText("My Account")).getText(), "My Account"); //asserts that "My Account" is now displayed within the top navigation
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals("Logout", driver.findElement(By.linkText("Logout")).getText(),"Logout"); //asserts that "Logout" is now displayed within the top navigation
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.linkText("Logout")).click(); //clicks "Logout"

        if (driver.getPageSource().contains("Login")) {
            System.out.println("Logout Successful");
        } else System.out.println("Logout unsuccessful");
    }

    @After
    public void afterTest() {
        driver.close(); //Closes the window
    }

}


