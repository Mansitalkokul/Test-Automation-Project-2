package com.delta.mansi.Assingments.Project2;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchingWindowPage {
    public WebDriver driver;

    public SwitchingWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToWindow() {
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {

            if (!parentWindow.equals(window)) {
                driver.switchTo().window(window);
            }


        }
    }

}
