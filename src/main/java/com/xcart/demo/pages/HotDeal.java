package com.xcart.demo.pages;

import com.xcart.demo.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;

import java.util.List;

public class HotDeal extends Utility {
    By hotDealsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']");
    By hoverSaleLink = By.linkText("Sale");
    By verifyTextSale = By.xpath("//h1[@id='page-title']");
    By hoverSortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By andselectNameAtoZ = By.partialLinkText("Name A -");
    By productArrangeAlphabetically = By.xpath("//h5[@class='product-name']/a[1]");
    By lowToHigh = By.partialLinkText("Price Low - Hi");
    By verifyPriceLowHigh = By.xpath("//span[@class='price product-price']");
    By rates = By.partialLinkText("Rates");
    By verifyRates = By.xpath("//span[contains(text(),'Rates')]");
    By mouseHoverBestsellers = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']");
    By textBestsellers = By.xpath("//h1[@id='page-title']");
    By ZToA = By.partialLinkText("Name Z -");
    By verifyZToA = By.xpath("//h5[@class='product-name']");
    By highToLow = By.partialLinkText("Price High - L");
    By verifyHighToLow = By.xpath("//span[@class='price product-price']");



    public void clickOnhotDealsLink() {
        mouseHoverToElement(hotDealsLink);
    }

    public void mouseHoverOnSaleLink() {
        mouseHoverAndClickToElement(hoverSaleLink);
    }

    public String verifyTextBySale() {
        return getTextFromElement(verifyTextSale);
    }

    public void mouseHoverSortBy() {
        mouseHoverToElement(hoverSortBy);
    }

    public void selectNameAtoZ() {
        clickOnElement(andselectNameAtoZ);
    }

    public List verifyProductArrangeAtoZ() {
        return getListFromElements(productArrangeAlphabetically);
    }

    public void selectLowToHigh() {
        clickOnElement(lowToHigh);
    }

    public List verifyPriceLowToHigh() {
        return getListFromElements(verifyPriceLowHigh);
    }

    public void selectRates() {
        clickOnElement(rates);
    }

    public List verifyPriceRates() {
        return getListFromElements(verifyRates);
    }

    public void mouseHoverOnBestsellers() {
        mouseHoverAndClickToElement(mouseHoverBestsellers);
    }

    public String getTextBestsellers() {
        return getTextFromElement(textBestsellers);
    }


    public void selectZtoA() {
        clickOnElement(ZToA);
    }

    public List verifyZToA() {
        return getListFromElements(verifyZToA);
    }

    public void selectHighToLow() {
        clickOnElement(highToLow);
    }

    public List verifyPriceHighToLow() {
        return getListFromElements(verifyHighToLow);
    }




}
