package com.nopcommerce.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends HomePage {
    By sortByZToA = By.xpath("//select[@id='products-orderby']");
    By sortBox = By.xpath("//h2[@class='product-title']");
    By addToCart = By.xpath("//img[@src='https://demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg']");

    public void selectSortByZToAFromDropDownMenu(String option) {
        doSelectByVisibleTextFromDropDown(sortByZToA, option);
    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        List<WebElement> originalList = driver.findElements(sortBox);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        Thread.sleep(3000);

        List<WebElement> afterSortingList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingList) {
            afterSortingProductName.add(product1.getText());
        }
        Assert.assertEquals(originalProductNameList, afterSortingProductName, "Product not sorted");
    }

    public void clickOnAddToCartForBuildYourOwnComputer(){
        doClickOnElement(addToCart);
    }
}
