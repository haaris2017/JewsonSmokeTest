package com.smoketests;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.io.File;
import jxl.*;
import jxl.write.*;

public class MultipleLogins {

    public WebDriver driver;
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
    public void createOrderNumber() throws Exception{

           Workbook wbIn = Workbook.getWorkbook(new File("C:\\Users\\C0198379\\Desktop\\Jewson Responsive\\Jewson Automation\\data.xls"));
           WritableWorkbook wbOut= Workbook.createWorkbook(new File("C:\\Users\\C0198379\\Desktop\\Jewson Responsive\\Jewson Automation\\testfile.xls"),wbIn);

           WritableSheet s = wbOut.getSheet("Sheet1");

           for(int i=1;i<=s.getRows();i++)

           {
               driver.findElement(By.linkText("Login")).click(); //clicks login from the top navigation
               driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'fancybox-frame')]"))); //Switches the script to the login window
               driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Username")).clear(); //clears the username field
               driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Username")).sendKeys(s.getWritableCell("A"+i).getContents()); //enters the username
               driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Password")).clear(); //clears the password field
               driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_Password")).sendKeys(s.getWritableCell("B"+i).getContents()); //enters the password
               driver.findElement(By.id("ContentPlaceHolder_LoginBox_2_LoginForm_LoginButton")).click(); //clicks the login button
               driver.switchTo().parentFrame(); //switches back to the parent frame (Header)
               Thread.sleep(5000);
               driver.findElement(By.linkText("Logout")).click(); //clicks "Logout"

               s.addCell(new Label(2, i - 1, "Executed"));

           }

           wbOut.write();
           wbOut.close();

    }

}
