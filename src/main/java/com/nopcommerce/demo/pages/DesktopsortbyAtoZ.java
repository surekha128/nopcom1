package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
2.3 Select Sort By position "Name: A to Z"

 */
public class DesktopsortbyAtoZ extends Utility {
    private static final Logger log = LogManager.getLogger(Computer.class.getName());

    @FindBy(id = "products-orderby")
    WebElement sortby;
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement SortBypositionNameAtoZ;

    public void getsortingpositionNameAtoZ() {
        Reporter.log("Clicking on sortby link : " + sortby.toString() + "<br>");
        mouseHoverToElement(sortby);
        log.info("Clicking on sortby link : " + sortby.toString());

        Reporter.log("Clicking on sortbyposition link : " + SortBypositionNameAtoZ.toString() + "<br>");
        clickOnElement(SortBypositionNameAtoZ);
        log.info("Clicking on sortbyposition link : " + SortBypositionNameAtoZ.toString());




    }
}
