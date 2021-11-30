package com.xcart.demo.pages;

import com.xcart.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenu extends Utility {
    By theShippingLink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//a[@href='shipping.html']//span[contains(text(),'Shipping')]");
    By verifyTextShipping=By.xpath("//h1[@id='page-title']");
    By clickNewLink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'New!')]");
    By verifyTextNewArrivals=By.xpath("//h1[@id='page-title']");
    By clickComingSoonLink=By.linkText("Coming soon");
    By verifyTextComingSoon=By.xpath("//h1[@id='page-title']");
    By contactUsLink=By.linkText("Contact us");
    By textContactUs=By.xpath("//h1[@id='page-title']");



    public void clickOnTheShippingLink(){clickOnElement(theShippingLink);}
    public String getVerifyTextShipping(){return getTextFromElement(verifyTextShipping);}
    public void clickOnNewLink(){clickOnElement(clickNewLink);}
    public String getVerifyTextNewArrivals(){return getTextFromElement(verifyTextNewArrivals);}
    public void clickOnComingSoonLink(){clickOnElement(clickComingSoonLink);}
    public String getVerifyTextComingSoon(){return getTextFromElement(verifyTextComingSoon); }
    public void clickOnContactUsLink(){clickOnElement(contactUsLink);}
    public String getVerifyTextContactUs(){return getTextFromElement(textContactUs);}

}
