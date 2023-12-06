package com.delta.mansi.Assingments.Project2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InitBrowser {
    WebDriver driver;

    @BeforeMethod
    public void initBrowser() throws InterruptedException {
        // Browser Initialization
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://indianrailways.gov.in/");

    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
    public void  captureScreenshot(WebDriver driver,String tName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");
        FileUtils.copyFile(source,target);
    }

}
