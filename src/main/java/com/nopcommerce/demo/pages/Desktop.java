package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Desktop extends Utility {
    private static final Logger log = LogManager.getLogger(Computer.class.getName());

    @FindBy(partialLinkText = "Deskto")
    WebElement desktoplink;

    public void clinklinkDesktop(){
        Reporter.log("Clicking on login link : " + desktoplink.toString() + "<br>");
        clickOnElement(desktoplink);
        log.info("Clicking on login link : " + desktoplink.toString());


    }

}
