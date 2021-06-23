package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.Computer;
import com.nopcommerce.demo.pages.Desktop;
import com.nopcommerce.demo.pages.DesktopsortbyAtoZ;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
Computer computer;
Desktop desktop;
DesktopsortbyAtoZ desktopsortbyAtoZ;

    @BeforeMethod
    public void setUp(){
        computer = new Computer();
        desktop = new Desktop();
        desktopsortbyAtoZ = new DesktopsortbyAtoZ();
    }
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        computer.clickonComputer();
        desktop.clinklinkDesktop();
        desktopsortbyAtoZ.getsortingpositionNameAtoZ();


    }
}
