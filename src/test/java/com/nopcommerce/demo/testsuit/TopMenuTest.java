package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ApparelPage apparelPage = new ApparelPage();
    ComputersPage computersPage = new ComputersPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    JewelleryPage jewelryPage = new JewelleryPage();
    BooksPage booksPage = new BooksPage();


    public void selectMenu(String menuName) throws InterruptedException {
        List<WebElement> names = homePage.getTopMenuNames(menuName);
        for (WebElement name : names) {
            if (name.getText().equalsIgnoreCase(menuName)) {
                name.click();
                break;
            }
        }
    }

    @Test
    public void verifyComputersPageNavigation() throws InterruptedException {
        selectMenu("Computers");
        String expectedMessage = "Computers";
        String actualMessage = computersPage.getComputersPageWelcomeText();
        doVerifyElements(expectedMessage, actualMessage, "page displayed incorrectly");

    }

    @Test
    public void verifyApparelPageNavigation() throws InterruptedException {
        selectMenu("Apparel");
        String expectedMessage = "Apparel";
        String actualMessage = apparelPage.getApparelPageText();
        doVerifyElements(expectedMessage, actualMessage, "page displayed incorrectly");
    }

    @Test
    public void verifyElectronicsPageNavigation() throws InterruptedException {
        selectMenu("Electronics");
        String expectedMessage = "Electronics";
        String actualMessage = electronicsPage.getElectronicsPageWelcomeText();
        doVerifyElements(expectedMessage, actualMessage, "page displayed incorrectly");
    }

    @Test
    public void verifyBooksPageNavigation() throws InterruptedException {
        selectMenu("Books");
        String expectedMessage = "Books";
        String actualMessage = booksPage.getBookPageWelcomeText();
        doVerifyElements(expectedMessage, actualMessage, "page displayed incorrectly");
    }

    @Test
    public void verifyDigitalDownloadsPageNavigation() throws InterruptedException {
        selectMenu("Digital downloads");
        String expectedMessage = "Digital downloads";
        String actualMessage = digitalDownloadsPage.getDigitalDownloadsPageWelcomeText();
        doVerifyElements(expectedMessage, actualMessage, "page displayed incorrectly");
    }

    @Test
    public void verifyGiftCardsPageNavigation() throws InterruptedException {
        selectMenu("Gift Cards");
        String expectedMessage = "Gift Cards";
        String actualMessage = giftCardsPage.getGiftCardsPageWelcomeText();
        doVerifyElements(expectedMessage, actualMessage, "page displayed incorrectly");
    }

    @Test
    public void verifyJewelryPageNavigation() throws InterruptedException {
        selectMenu("Jewelry");
        String expectedMessage = "Jewelry";
        String actualMessage = jewelryPage.getJewelryPageText();
        doVerifyElements(expectedMessage, actualMessage, "page displayed incorrectly");
    }

}
