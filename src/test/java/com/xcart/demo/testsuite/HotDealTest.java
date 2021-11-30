package com.xcart.demo.testsuite;

import com.xcart.demo.pages.HotDeal;
import com.xcart.demo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotDealTest extends TestBase {
    HotDeal hotdeaal = new HotDeal();

    @Test

    //	1 - verifySaleProductsArrangeAlphabetically()
    //		1.1 Mouse hover on the “Hot deals” link
    //		1.2 Mouse hover on the “Sale”  link and click
    //		1.3 Verify the text “Sale”
    //		1.4 Mouse hover on “Sort By” and select “Name A-Z”
    //		1.5 Verify that the product arrange alphabetically

    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {

        hotdeaal.clickOnhotDealsLink();
        hotdeaal.mouseHoverOnSaleLink();
        String expectedMessage = "Sale";
        String actualMessage = hotdeaal.verifyTextBySale();
        Assert.assertEquals(expectedMessage, actualMessage);

        hotdeaal.mouseHoverSortBy();
        hotdeaal.selectNameAtoZ();

        List<WebElement> originalList;
        originalList = hotdeaal.verifyProductArrangeAtoZ();
        List<String> productList = new ArrayList<>();
        for (WebElement productname : originalList) {

            productList.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productList);
        Collections.sort(tempList);
        System.out.println(productList);
        System.out.println(tempList);
        Assert.assertEquals(productList, tempList);
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {

        // verifySaleProductsPriceArrangeLowToHigh()
        //		2.1 Mouse hover on the “Hot deals” link
        //		2.2 Mouse hover on the “Sale”  link and click
        //		2.3 Verify the text “Sale”
        //		2.4 Mouse hover on “Sort By” and select “Price Low-High”
        //		2.5 Verify that the product’s price arrange Low to High

        hotdeaal.clickOnhotDealsLink();
        hotdeaal.mouseHoverOnSaleLink();
        String expectedMessage = "Sale";
        String actualMessage = hotdeaal.verifyTextBySale();
        Assert.assertEquals(expectedMessage, actualMessage);

        hotdeaal.mouseHoverSortBy();
        hotdeaal.selectLowToHigh();

        Thread.sleep(1000);
        List<WebElement> originalPrice;
        originalPrice = hotdeaal.verifyPriceLowToHigh();
        List<String> productPrice = new ArrayList<>();
        for (WebElement productname : originalPrice) {

            productPrice.add(productname.getText());
        }
        List<String> priceList = new ArrayList<>();
        priceList.addAll(productPrice);
        Collections.sort(priceList);
        System.out.println(productPrice);
        System.out.println(priceList);
        Assert.assertEquals(productPrice, priceList);
    }

    @Test
    public void vefirySalesProductsArrangedByRates() {
       // 3.1 Mouse hover on the “Hot deals” link
        //		3.2 Mouse hover on the “Sale”  link and click
        //		3.3 Verify the text “Sale”
        //		3.4 Mouse hover on “Sort By” and select “Rates”
        //		3.5 Verify that the product’s arrange Rates
        hotdeaal.clickOnhotDealsLink();
        hotdeaal.mouseHoverOnSaleLink();
        String expectedMessage = "Sale";
        String actualMessage = hotdeaal.verifyTextBySale();
        Assert.assertEquals(expectedMessage, actualMessage);

        hotdeaal.mouseHoverSortBy();
        hotdeaal.selectRates();

        List<WebElement> originalRates;
        originalRates = hotdeaal.verifyPriceRates();
        List<String> productRates = new ArrayList<>();
        for (WebElement productname : originalRates) {

            productRates.add(productname.getText());
        }
        List<String> RatesList = new ArrayList<>();
        RatesList.addAll(productRates);
        Collections.sort(RatesList);
        System.out.println(productRates);
        System.out.println(RatesList);
        Assert.assertEquals(productRates, RatesList);

    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA(){
     //		1.1 Mouse hover on the “Hot deals” link
        //		1.2 Mouse hover on the “Bestsellers”  link and click
        //		1.3 Verify the text “Bestsellers”
        //		1.4 Mouse hover on “Sort By” and select “Name Z-A”
        //		1.5 Verify that the product arrange by Z to A
        hotdeaal.clickOnhotDealsLink();
        hotdeaal.mouseHoverOnBestsellers();
        String expectedMessage = "Bestsellers";
        String actualMessage = hotdeaal.getTextBestsellers();
        Assert.assertEquals("Text verify", expectedMessage, actualMessage);
        hotdeaal.mouseHoverSortBy();
        hotdeaal.selectZtoA();
        List<WebElement> originalList;
        originalList = hotdeaal.verifyZToA();
        List<String> productList = new ArrayList<>();
        for (WebElement productname : originalList) {

            productList.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productList);
        Collections.sort(tempList);
        System.out.println(productList);
        System.out.println(tempList);
        Assert.assertEquals(productList, tempList);
    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow(){
         //2.1 Mouse hover on the “Hot deals” link
        //		2.2 Mouse hover on the “Bestsellers” link and click
        //		2.3 Verify the text “Bestsellers”
        //		2.4 Mouse hover on “Sort By” and select “Price High-Low”
        //		2.5 Verify that the product’s price arrange High to Low
        hotdeaal.clickOnhotDealsLink();
        hotdeaal.mouseHoverOnBestsellers();
        String expectedMessage = "Bestsellers";
        String actualMessage = hotdeaal.getTextBestsellers();
        Assert.assertEquals("Text verify", expectedMessage, actualMessage);
        hotdeaal.mouseHoverSortBy();
        hotdeaal.selectHighToLow();

        List<WebElement> originalPrice;
        originalPrice = hotdeaal.verifyPriceHighToLow();
        List<String> productPrice = new ArrayList<>();
        for (WebElement productname : originalPrice) {

            productPrice.add(productname.getText());
        }
        List<String> priceList = new ArrayList<>();
        priceList.addAll(productPrice);
        Collections.sort(priceList);
        System.out.println(productPrice);
        System.out.println(priceList);
        Assert.assertEquals(productPrice, priceList);

    }

    //6 - verifyBestSellersProductsArrangeByRates()
    //		3.1 Mouse hover on the “Hot deals” link
    //		3.2 Mouse hover on the “Bestsellers”  link and click
    //		3.3 Verify the text “Bestsellers”
    //		3.4 Mouse hover on “Sort By” and select “Rates”
    //		3.5 Verify that the product’s arrange Rates
    @Test
     public void verifyBestSellersProductsArrangeByRates(){
        hotdeaal.clickOnhotDealsLink();
        hotdeaal.mouseHoverOnBestsellers();
        String expectedMessage = "Bestsellers";
        String actualMessage = hotdeaal.getTextBestsellers();
        Assert.assertEquals("Text verify", expectedMessage, actualMessage);
        hotdeaal.mouseHoverSortBy();
        hotdeaal.selectRates();

        List<WebElement> originalRates;
        originalRates = hotdeaal.verifyPriceRates();
        List<String> productRates = new ArrayList<>();
        for (WebElement productname : originalRates) {

            productRates.add(productname.getText());
        }
        List<String> RatesList = new ArrayList<>();
        RatesList.addAll(productRates);
        Collections.sort(RatesList);
        System.out.println(productRates);
        System.out.println(RatesList);
        Assert.assertEquals(productRates, RatesList);
    }
}



