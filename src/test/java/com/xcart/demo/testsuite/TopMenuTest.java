package com.xcart.demo.testsuite;

import com.xcart.demo.pages.TopMenu;
import com.xcart.demo.testbase.TestBase;
import org.junit.After;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenu topMenu = new TopMenu();

    @Test
    //1 - verifyUserShouldNavigateToShippingPageSuccessfully()
    //		1.1 Click on the “Shipping” link
    //		1.2 Verify the text “Shipping”
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        topMenu.clickOnTheShippingLink();
        String expectedMessage = "Shipping";
        String actualMessage = topMenu.getVerifyTextShipping();
        Assert.assertEquals(expectedMessage, actualMessage,"Text verify");
    }
    //2 - verifyUserShouldNavigateToNewPageSuccessfully()
    //		2.1 Click on the “New!” link
    //		2.2 Verify the text “New arrivals”
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
         topMenu.clickOnNewLink();
        String expectedMessage = "New arrivals";
        String actualMessage = topMenu.getVerifyTextNewArrivals();
        Assert.assertEquals(expectedMessage,actualMessage,"Text verify");
    }
    //	3 - verifyUserShouldNavigateToComingsoonPageSuccessfully()
    //		3.1 Click on the “Coming soon” link
    //		3.2 Verify the text “Coming soon”
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        topMenu.clickOnComingSoonLink();
        String expectedMessage = "Coming soon";
        String actualMessage = topMenu.getVerifyTextComingSoon();
        Assert.assertEquals(actualMessage,expectedMessage,"Text verify");
    }
    //	4 - verifyUserShouldNavigateToContactUsPageSuccessfully()
    //		4.1 Click on the “Contact us” link
    //		4.2 Verify the text “Contact us”
    @Test
    public void  verifyUserShouldNavigateToContactUsPageSuccessfully(){
        topMenu.clickOnContactUsLink();
        String expectedMessage = "Contact us";
        String actualMessage = topMenu.getVerifyTextContactUs();
        Assert.assertEquals(actualMessage,expectedMessage,"Text verify");
    }
}






