package com.nopcommerce.demo.TestNG;

import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class TestNGGrouping {

    @Test(groups = {"sanity", "regression"})
    public void loginTest1() {
        System.out.println("Running test - HomePageTest");
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void loginTest() {
        System.out.println("Running test - ProductAddedToShoppingCartSuccessfully");
    }
    public void loginTest2() {System.out.println("Running test - HomePageTest");}

    @Test(groups = {"smoke", "regression1", "regression"})
    public void loginTest3() {
        System.out.println("Running test - ProductAddedToShoppingCartSuccessfully");
    }

    @Test(groups = {"smoke", "regression1", "regression"})
    public void loginTest4() {
        System.out.println("Running test - HomePageTest");
    }

    @Test(groups = {"regression1", "regression"})
    public void regressionTest1() {
        System.out.println("Running test - regressionTest1");
    }

    @Test(groups = {"regression1", "regression"})
    public void computerTest1() {
        System.out.println("Running test - computerTest1");
    }

    @Test(groups = {"regression1", "regression"})
    public void computerTest2() {
        System.out.println("Running test - computerTest2");
    }

}
