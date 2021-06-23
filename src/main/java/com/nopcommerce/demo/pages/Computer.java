package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
1.Test name verifyProductArrangeInAlphaBaticalOrder()
	1.1 Click on Computer Menu.
	1.2 Click on Desktop
	1.3 Select Sort By position "Name: Z to A"
	1.4 Verify the Product will arrange in Descending order.

2. Test name verifyProductAddedToShoppingCartSuccessFully()
	2.1 Click on Computer Menu.
	2.2 Click on Desktop
	2.3 Select Sort By position "Name: A to Z"
	2.4 Click on "Add To Cart"
	2.5 Verify the Text "Build your own computer"
	2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
	2.7.Select "8GB [+$60.00]" using Select class.
	2.8 Select HDD radio "400 GB [+$100.00]"
	2.9 Select OS radio "Vista Premium [+$60.00]"
           	2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
	2.11 Verify the price "$1,475.00"
	2.12 Click on "ADD TO CARD" Button.
	2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
 */
public class Computer extends Utility {
  private static final Logger log = LogManager.getLogger(Computer.class.getName());

    @FindBy(partialLinkText = "Compute")
    WebElement computer;

    @FindBy(partialLinkText = "Deskto")
    WebElement desktop;

    public void clickonComputer(){
        Reporter.log("Clicking on computer link : " + computer.toString() + "<br>");
        mouseHoverToElement(computer);
        log.info("Clicking on computer link : " + computer.toString());

        Reporter.log("Clicking on desktop link : " + desktop.toString() + "<br>");
        clickOnElement(desktop);
        log.info("Clicking on desktop link : " + desktop.toString());

    }


}
