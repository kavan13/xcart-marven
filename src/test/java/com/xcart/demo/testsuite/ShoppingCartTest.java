package com.xcart.demo.testsuite;

import com.xcart.demo.pages.HotDeal;
import com.xcart.demo.pages.ShoppingCart;
import com.xcart.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class ShoppingCartTest extends TestBase {
    HotDeal hotDeal = new HotDeal();
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException {

        //1 - verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetooth Speaker()


        //		1.1 Mouse hover on the “Hot deals” link
        hotDeal.clickOnhotDealsLink();

        //		1.2 Mouse hover on the “Sale”  link and click
        hotDeal.mouseHoverOnSaleLink();
        //		1.3 Verify the text “Sale”
        Thread.sleep(1000);
        String expectedMessage = "Sale";
        String actualMessage = hotDeal.verifyTextBySale();
        Assert.assertEquals(expectedMessage, actualMessage);

        //		1.4 Mouse hover on “Sort By” and select “Name A-Z”
        Thread.sleep(1000);
        hotDeal.mouseHoverSortBy();
        hotDeal.selectNameAtoZ();

        //		1.5 Click on “Add to cart” button of the product “Cup of Mojo Bluetooth Speaker”
        Thread.sleep(1000);
        shoppingCart.clickOnAddToCart();
        //1.6 Verify the@ message “Product has been added to your cart” display in  green bar
        String expectedMessage1 = "Product has been added to your cart";
        String actualMessage1 = shoppingCart.verifyGreenBarMsg();
        Assert.assertEquals(expectedMessage1, actualMessage1);

        //1.7 Click on X sign to close the message
        Thread.sleep(1000);
        shoppingCart.cilckOnCloseTab();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        shoppingCart.cickonYourCart();
        Thread.sleep(1000);
        shoppingCart.cickonViewCart();
        //1.9 Verify the text “Your shopping cart - 1 item”
        Thread.sleep(1000);
        String expectedMessage2 = "Your shopping cart - 1 item";
        String actualMessage2 = shoppingCart.verifyShoppingCart1();
        Assert.assertEquals(expectedMessage2, actualMessage2);

        //clv1.10 Change the Qty = 2
        shoppingCart.clearQuantity();
        Thread.sleep(1000);
        shoppingCart.enterChangeQty("2");

        //1.11 Verify the text “Your shopping cart - 2 items”
        String expectedMessage3 = "Your shopping cart - 2 items";
        String actualMessage3 = shoppingCart.verifyTextShoppingCart2();
        Assert.assertEquals(expectedMessage3, actualMessage3);

        //1.12 Verify the Subtotal $39.98
        Thread.sleep(1000);
        String expectedMessage4 = "Subtotal: $29.98";
        String actualMessage4 = shoppingCart.verifyTextTotal2998();
        Assert.assertEquals(expectedMessage4, actualMessage4);

        //1.13 Verify the total $46.18
        Thread.sleep(1000);
        String expectedMessage5 = "$36.00";
        String actualMessage5 = shoppingCart.verifyTextTotal36();
        Assert.assertEquals(expectedMessage5, actualMessage5);

        //1.14 Click on “Go to checkout” button
        shoppingCart.clickOnContinueButton();

        //1.15 Verify the text “Log in to your account”
        Thread.sleep(1000);
        String expectedMessage6 = "Log in to your account";
        String actualMessage6 = shoppingCart.verifyTextLoginAccount();
        Assert.assertEquals(expectedMessage6, actualMessage6);

        //1.16 Enter Email address
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        shoppingCart.selectEmail("abc" + randomNumber + "@gmail.com");

        //1.17 Click on “Continue” Button
        Thread.sleep(1000);
        shoppingCart.clickOnEmailContinueButton();

        //1.18 Verify the text “Secure Checkout”
        String expectedMessage7 = "Secure Checkout";
        String actualMessage7 = shoppingCart.verifySecureCheckOut();
        Thread.sleep(1000);
        Assert.assertEquals(expectedMessage7, actualMessage7);
        //1.19 Fill all the mandatory fields
        shoppingCart.enterFirstName("Kavan");
        Thread.sleep(1000);
        shoppingCart.enterLastName("Patel");
        shoppingCart.enterAddress("12 Road");
        shoppingCart.clearCity();
        Thread.sleep(1000);
        shoppingCart.enterCity("London");
        shoppingCart.enterCountry("United kingdom");
        Thread.sleep(1000);
        shoppingCart.enterState("London");
        shoppingCart.clearZipCode();
        shoppingCart.enterZipCode("Ha8 9Qe");

        //1.20 Check the check box “Create an account for later use”
        shoppingCart.cilckOnCreateAccountLater();

        //1.21 Enter the password
        Thread.sleep(1000);
        shoppingCart.enterPassword("abcd123#");

        //1.22 Select the Delivery Method to “Local Shipping”Use
        shoppingCart.cilckOnLocalShipping();

        //1.23 Select Payment Method “COD”
        Thread.sleep(1000);
        shoppingCart.cilckOnCashOnDelivery();

        //1.24 Verify the total $47.22
        String expectedTotal = "$36.00";
        String actualTotal = shoppingCart.verifyTotal36();
        Assert.assertEquals(expectedTotal, actualTotal);

        //1.25 Click on “Place Order” Button
        Thread.sleep(1000);
        shoppingCart.cilckOnPlaceOrderButton();

        //1.26 Verify the text “Thank you for your order”
        String expectedMessage8 = "Thank you for your order";
        String actualMessage8 = shoppingCart.verifyThankYouMessage();
        Assert.assertEquals(expectedMessage8, actualMessage8);
    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        //		1.1 Mouse hover on the “Hot deals” link
        hotDeal.clickOnhotDealsLink();

        //		1.2 Mouse hover on the “Bestseller”  link and click
        hotDeal.mouseHoverOnBestsellers();
        //		1.3 Verify the text “Bestsellers”
        Thread.sleep(1000);
        String expectedMessage = "Bestsellers";
        String actualMessage = hotDeal.getTextBestsellers();
        Assert.assertEquals(expectedMessage, actualMessage);
        //		1.4 Mouse hover on “Sort By” and select “Name A-Z”
        hotDeal.mouseHoverSortBy();
        Thread.sleep(1000);
        hotDeal.selectNameAtoZ();

        //		1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        shoppingCart.clickAddtoProduct7();
        Thread.sleep(1000);
        shoppingCart.clickOnProductButton();
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedMessage1 = "Product has been added to your cart";
        String actualMessage1 = shoppingCart.verifyGreenBarMsg();
        Assert.assertEquals(expectedMessage1, actualMessage1);
        //1.7 Click on X sign to close the message
        Thread.sleep(1000);
        shoppingCart.cilckOnCloseTab();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        shoppingCart.cickonYourCart();
        Thread.sleep(1000);
        shoppingCart.cickonViewCart();
        //1.9 Verify the text “Your shopping cart - 1 item”
        Thread.sleep(1000);
        String expectedMessage2 = "Your shopping cart - 1 item";
        String actualMessage2 = shoppingCart.verifyShoppingCart1();
        Assert.assertEquals(expectedMessage2, actualMessage2);
        //1.10 Click on “Empty your cart” link
        Thread.sleep(1000);
        shoppingCart.clickOnEmptyCart();
        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        String expectedAlertMsg = "Are you sure you want to clear your cart?";
        String actualAlertMsg = shoppingCart.verifyAlertMessage();
        Assert.assertEquals(expectedAlertMsg, actualAlertMsg);
        //1.12 Click “Ok” on alert
        Thread.sleep(1000);
        shoppingCart.acceptOkAlert();

        //1.13 Verify the message “Item(s) deleted from your cart”
        String expectedDeleteMsg = "Item(s) deleted from your cart";
        String actualDeleteMsg = shoppingCart.getTextdeldeleteCart();
        Assert.assertEquals(expectedDeleteMsg, actualDeleteMsg);
        shoppingCart.clickOnClose();
        Thread.sleep(1000);
        //1.15 Verify the text “Your cart is empty”
        String expectedMsg1 = "Your cart is empty";
        String actualMsg1 = shoppingCart.getTextYourCartEmpty();
        Assert.assertEquals(expectedMsg1, actualMsg1);
    }
}
