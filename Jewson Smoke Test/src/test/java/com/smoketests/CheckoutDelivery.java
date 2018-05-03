package com.smoketests;

import java.io.FileOutputStream;
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

public class CheckoutDelivery {
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
    public void testLogIn() throws Exception {
        FileInputStream fi = new FileInputStream("C:\\Users\\C0198379\\Desktop\\Jewson Responsive\\Jewson Automation\\JewsonOrderReferenceNumbers.xls");
        Workbook w = Workbook.getWorkbook(fi);
        Sheet s = w.getSheet("Sheet1");

        for(int i=1;i<=s.getRows();i++)

        {
            driver.findElement(By.linkText("Login")).click(); //clicks login from the top navigation
            Thread.sleep(5000);
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'fancybox-frame')]"))); //Switches the script to the login window
            driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Username")).clear(); //clears the username field
            driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Username")).sendKeys("webteam"); //enters the username
            driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Password")).clear(); //clears the password field
            driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Password")).sendKeys("c0v3ntry019"); //enters the password
            driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_LoginButton")).click(); //clicks the login button
            driver.switchTo().parentFrame(); //switches back to the parent frame (Header)
            Thread.sleep(5000);
            driver.findElement(By.xpath("//ul[@id='DesktopNavigationPrimary']/li[4]/a/span")).click();
            driver.findElement(By.xpath("(//a[contains(text(),'Cement')])[2]")).click();
            driver.findElement(By.linkText("Standard Cements")).click();
            Thread.sleep(5000);
            driver.findElement(By.linkText("Lafarge Blue Circle Cement 25Kg")).click();
            driver.findElement(By.id("ProductDetails_9_QuantityTxt")).click();
            driver.findElement(By.id("ProductDetails_9_QuantityTxt")).clear();
            driver.findElement(By.id("ProductDetails_9_QuantityTxt")).sendKeys("15");
            driver.findElement(By.xpath("//div[@id='Content']/span/div/div[2]/div[2]/div/div")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("ProductDetails_9_AddToBasketBtn")).click();
            Thread.sleep(5000);
            driver.findElement(By.linkText("View my list")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("ContentPlaceHolder_BasketV2_10_ProceedCheckoutBottomLnk")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("CheckoutV2_2_CheckoutBasketRpt_DeliverOrder")).click();
            driver.findElement(By.id("CheckoutV2_2_ProceedBtn")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("CheckoutV2_2_CustomerOrderRefTxt")).sendKeys(s.getCell("A" + i).getContents());
            driver.findElement(By.id("CheckoutV2_2_ProceedDetailsBtn")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("CheckoutV2_2_ctl03_ConfirmDeliveryBtn")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("CheckoutV2_2_ctl03_ConfirmOrderBtn")).click();
            Thread.sleep(5000);
            driver.findElement(By.linkText("Click here to return home")).click();
            Thread.sleep(5000);
            driver.findElement(By.linkText("Logout")).click();

            assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Logout')]")).getText(), "Logout");

            //ADD VERIFICATION TO STEPS
        }
    }

    @After
    public void afterTest() {
        driver.close();
    }

}