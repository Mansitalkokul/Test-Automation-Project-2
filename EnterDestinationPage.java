package com.delta.mansi.Assingments.Project2;

import org.openqa.selenium.*;

import java.io.IOException;
import java.util.Set;

public class EnterDestinationPage {
    public WebDriver driver;
    By txtOrigin = By.xpath("//input[@type='text']");

    public EnterDestinationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToWindowPage2() {
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {

            if (!parentWindow.equals(window)) {
                driver.switchTo().window(window);
            }

        }
    }
    public void enterDestination (String destination) throws IOException {

        WebElement clickOnOrigin = driver.findElement(txtOrigin);
        clickOnOrigin.sendKeys("Tirupati");
        clickOnOrigin.click();
        InitBrowser im = new InitBrowser();
        im.captureScreenshot(driver,"addUser");


    }



}