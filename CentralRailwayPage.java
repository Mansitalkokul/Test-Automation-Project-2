package com.delta.mansi.Assingments.Project2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CentralRailwayPage {
    public WebDriver driver;

    By txtHolidayPkg = By.xpath("//a[@title='Holiday Packages']");

    public CentralRailwayPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnHolidayPackage() throws InterruptedException {
        WebElement holidayPackage = driver.findElement(txtHolidayPkg);
        holidayPackage.click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
