package com.xcart.demo.pages;

import com.xcart.demo.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By addTocartAvengers = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-16')]//span[contains(text(),'Add to cart')]");
    By verifyGreenBarMsg = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeTab = By.xpath("//a[@class='close']");
    By yourCart = By.xpath("//div[@title='Your cart']");
    By viewCart = By.xpath("//span[contains(text(),'View cart')]");
    By verifyShoppingCart1 = By.xpath("//h1[@id='page-title']");
    By changeQty = By.xpath("//input[@id='amount16']");
    By verifyShoppingCart2 = By.xpath("//h1[text()='Your shopping cart - 2 items']");
    By verifyTotal2998 = By.xpath("//ul[@class='sums']//li[@class='subtotal']");
    By verifyTotal36 = By.xpath("//li[@class='total']");
    By continueButton = By.xpath("//span[contains(text(),'Go to checkout')]");
    By verifyLoginAccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By enterEmail = By.xpath("//input[@id='email']");
    By emailContinueButton = By.xpath("//*[@class='btn  regular-button anonymous-continue-button submit']");
    By verifySecureCheckout = By.xpath("//h1[@class='title']");
    By firstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By address = By.xpath("//input[@id='shippingaddress-street']");
    By city = By.xpath("//input[@id='shippingaddress-city']");
    By country = By.xpath("//select[@id='shippingaddress-country-code']");
    By state = By.xpath("//input[@id='shippingaddress-custom-state']");
    By zipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By createAccountLater = By.xpath("//input[@id='create_profile']");
    By password = By.xpath("//input[@id='password']");
    By localShipping = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/ul[1]/li[2]/div[1]");
    By cashOnDelivery = By.xpath("//input[@id='pmethod6']");
    By verifyPrice = By.xpath("//div[@class='total clearfix']//span[@class='surcharge']");
    By placeOrderButton = By.xpath("//*[@class='btn regular-button regular-main-button place-order submit']");
    By thankyouMsg = By.xpath("//h1[@id='page-title']");
    By addToCart4=By.xpath("//div[@class='product productid-13 ']");
    By productButton=By.xpath("//div[@class='product productid-13 ']//div[@class='add-to-cart-button']");
    By emptyCart=By.xpath("//a[contains(text(),'Empty your cart')]");
    By textDeleteYourCart=By.xpath("//li[text()='Item(s) deleted from your cart']");
    By close=By.xpath("//a[@class='close']");
    By textYourCartEmpty=By.xpath("//h1[@id='page-title']");

    public void clickOnAddToCart() {
        clickOnElement(addTocartAvengers);
    }

    public String verifyGreenBarMsg() {
        return getTextFromElement(verifyGreenBarMsg);
    }

    public void cilckOnCloseTab() {
        clickOnElement(closeTab);
    }

    public void cickonYourCart() {
        clickOnElement(yourCart);
    }

    public void cickonViewCart() {
        clickOnElement(viewCart);
    }

    public String verifyShoppingCart1() {
        return getTextFromElement(verifyShoppingCart1);
    }

    public void clearQuantity() {
        clearValue(changeQty);
    }

    public void enterChangeQty(String value) {
        sendTextToElement(changeQty, value);
    }

    public String verifyTextShoppingCart2() {
        return getTextFromElement(verifyShoppingCart2);
    }

    public String verifyTextTotal2998() {
        return getTextFromElement(verifyTotal2998);
    }

    public String verifyTextTotal36() {
        return getTextFromElement(verifyTotal36);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public String verifyTextLoginAccount() {
        return getTextFromElement(verifyLoginAccount);
    }

    public void selectEmail(String email) {
        sendTextToElement(enterEmail, email);
    }

    public void clickOnEmailContinueButton() {
        clickOnElement(emailContinueButton);
    }
    public String verifySecureCheckOut() {
        return getTextFromElement(verifySecureCheckout);
    }
    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }
    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
    }
    public void enterAddress(String name) {
        sendTextToElement(address, name);
    }
    public void clearCity() {
        clearValue(city);
    }
    public void enterCity(String name) {
        sendTextToElement(city, name);
    }
    public void enterCountry(String name) {
        sendTextToElement(country, name);
    }
    public void enterState(String name) {
        sendTextToElement(state, name);
    }

    public void clearZipCode() {
        clearValue(zipCode);
    }
    public void enterZipCode(String name) {
        sendTextToElement(zipCode, name);
    }

    public void cilckOnCreateAccountLater() {
        mouseHoverAndClickToElement(createAccountLater);
    }

    public void enterPassword(String name) {
        sendTextToElement(password, name);
    }

    public void cilckOnLocalShipping() {
        mouseHoverAndClickToElement(localShipping);
    }
    public void cilckOnCashOnDelivery() {
        clickOnElement(cashOnDelivery);
    }

    public String verifyTotal36() {
        return getTextFromElement(verifyPrice);
    }
    public void cilckOnPlaceOrderButton() {
        clickOnElement(placeOrderButton);
    }
    public String verifyThankYouMessage() {
        return getTextFromElement(thankyouMsg);
    }
    public void clickAddtoProduct7(){mouseHoverToElement(addToCart4);}
    public void clickOnProductButton(){clickOnElement(productButton);}
    public void clickOnEmptyCart(){clickOnElement(emptyCart);}
    public String getTextdeldeleteCart(){return getTextFromElement(textDeleteYourCart);}
    public void clickOnClose(){clickOnElement(close);}
    public String getTextYourCartEmpty(){return getTextFromElement(textYourCartEmpty);}
    public String verifyAlertMessage() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
    public void acceptOkAlert(){
        selectAcceptAlert();
    }

}

