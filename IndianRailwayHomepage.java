package com.delta.mansi.Assingments.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IndianRailwayHomepage {
    public WebDriver driver;

    By txtZone = By.xpath("//a[@title='Zonal Railways']");
    By txtCentralRail = By.xpath("//a[@title='Central Railway']");

    public IndianRailwayHomepage(WebDriver driver) {
        this.driver = driver;
    }

    public void zonalRailway() {
        WebElement mouceHover = driver.findElement(txtZone);
        Actions action = new Actions(driver);
        action.moveToElement(mouceHover).perform();

    }

    public void txtCentral() {
        WebElement clickCentral = driver.findElement(txtCentralRail);
        clickCentral.click();

    }

}