package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.Computer;
import com.nopcommerce.demo.pages.Desktop;
import com.nopcommerce.demo.pages.DesktopsortbyAtoZ;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductAddedToShoppingCartSuccessFully extends TestBase {

    Computer computer;
    Desktop desktop;
    DesktopsortbyAtoZ desktopsortbyAtoZ;
    BuildYourOwnComputer buildYourOwnComputer;

    @BeforeMethod
    public void setUp() {
        computer = new Computer();
        desktop = new Desktop();
        desktopsortbyAtoZ = new DesktopsortbyAtoZ();
        buildYourOwnComputer = new BuildYourOwnComputer();
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        computer.clickonComputer();
        desktop.clinklinkDesktop();
        desktopsortbyAtoZ.getsortingpositionNameAtoZ();
        Thread.sleep(3000);
        buildYourOwnComputer.addtocartclick();
        buildYourOwnComputer.buildyourowncomputerproductselectprocessor("2");//choose 1 or 2
        buildYourOwnComputer.buildyourowncomputerproductselectram("5");//choose 3 or 4 or 5
        buildYourOwnComputer.buildyourowncomputerproductselectHDD("7");//6 or 7
        buildYourOwnComputer.selectOS("9");//choose 8 or 9
        buildYourOwnComputer.selectSoftware("12");//choose 10 or 11 or 12
        buildYourOwnComputer.clickoOnADDTOCARD();
    }
}
