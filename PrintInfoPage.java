package com.delta.mansi.Assingments.Project2;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class PrintInfoPage {
    public WebDriver driver;

    public PrintInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getInfoOnConsole() {
        ArrayList obj = new ArrayList();
        System.out.println("BLISSFUL TIRUPATI");

        obj.add("Duration: 1Night/2Days");
        obj.add("Origin: MUMBAI");
        obj.add("Departure: Saturday");
        obj.add("Package Code: WMA17");
        obj.add("Destination: TIRUPATI");
        obj.add("Upcoming Date Of Journey: 28-OCT-23");
        obj.add("Amount: ₹14800");

        for (Object ob : obj) {
            System.out.println(ob);

        }
    }
}
