package com.delta.mansi.Assingments.Project2;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestPage extends InitBrowser {
    @Test
    public void project2 () throws InterruptedException, IOException {
        InitBrowser init = new InitBrowser();

        IndianRailwayHomepage txtZonalRail = new IndianRailwayHomepage(driver);
        txtZonalRail.zonalRailway();
        txtZonalRail.txtCentral();

        SwitchingWindowPage txtSwitchToWindow1= new SwitchingWindowPage(driver);
        txtSwitchToWindow1.switchToWindow();

        CentralRailwayPage txtClickOnHolidayPackage = new CentralRailwayPage(driver);
        txtClickOnHolidayPackage.clickOnHolidayPackage();

        EnterDestinationPage txtEnterDestinationInfo = new EnterDestinationPage(driver);
        txtEnterDestinationInfo.switchToWindowPage2();
        txtEnterDestinationInfo.enterDestination("Tirupati");


        PrintInfoPage txtGetInfo = new PrintInfoPage(driver);
        txtGetInfo.getInfoOnConsole();

    }
}
