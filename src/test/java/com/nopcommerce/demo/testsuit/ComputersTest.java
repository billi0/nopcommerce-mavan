package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {

    HomePage homePage = new HomePage();
    ElectronicsCellPhonesPage electronicsCellPhonesPage = new ElectronicsCellPhonesPage();
    CellPhonesListViewPage cellPhonesListViewPage = new CellPhonesListViewPage();
    CellPhonesListViewNokiaLumiaPage cellPhonesListViewNokiaLumiaPage = new CellPhonesListViewNokiaLumiaPage();
    CellPhonesListViewNokiaLumiaShoppingCartPage shoppingCartPage = new CellPhonesListViewNokiaLumiaShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegistrationPage register = new RegistrationPage();
    RegistrationCompletePage registrationComplete = new RegistrationCompletePage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ShippingOptionCheckoutPage shippingOption = new ShippingOptionCheckoutPage();
    PaymentMethodPage paymentMethod = new PaymentMethodPage();
    PaymentInfoPage paymentInfo = new PaymentInfoPage();
    ConfirmOrderPage confirmOrder = new ConfirmOrderPage();
    CheckoutCompletedPage checkoutComplete = new CheckoutCompletedPage();
    WelcomeToOurStorePage welcomePage = new WelcomeToOurStorePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void testComputersPage() throws InterruptedException {

        homePage.clickOnComputerMenu();
        computersPage.clickOnDesktopOptionOfComputerTab();
        desktopPage.selectSortByZToAFromDropDownMenu("Name: Z to A");
        desktopPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {
        testComputersPage();

        desktopPage.clickOnAddToCartForBuildYourOwnComputer();

        buildYourOwnComputerPage.verifyTheBuildYourOwnComputerMessage();
        buildYourOwnComputerPage.selectGhzIntelPentiumDualCore("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(3000);
        buildYourOwnComputerPage.selectRamAs8Gb(3);
        Thread.sleep(3000);
        buildYourOwnComputerPage.selectHDDRadio();
        Thread.sleep(3000);
        buildYourOwnComputerPage.selectOSRadioButton();
        Thread.sleep(3000);
        buildYourOwnComputerPage.clickOnTotalCommander();
        //buildYourOwnComputerPage.waitForElementToBeVisible(40);
        Thread.sleep(5000);
        buildYourOwnComputerPage.verifyTotalAmount();
        buildYourOwnComputerPage.clickOnAddToCartButton();
        buildYourOwnComputerPage.verifyProductHasBeenAddedToYourShoppingCartMessage();
        buildYourOwnComputerPage.closeTheBarByClickingOnCrossButton();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCartButton();

        shoppingCart.verifyTheShoppingCartDisplayMessage();
        shoppingCart.clearTheQuantityField();
        shoppingCart.updateTheQuantityField("2");
        shoppingCart.clickOnUpdateShoppingCart();
        shoppingCart.verifyTotalAmount("$2,950.00");
        shoppingCart.agreeWithTermsAndConditions();
        shoppingCart.clickOnCheckoutButton();

        signInPage.verifyTheSignInDisplayMessage();
        signInPage.clickOnCheckOutAsAGuestTab();

        checkoutPage.enterNameInTheFirstNameField("George");
        checkoutPage.enterLastNameInTheLastNameField("Smith");
        checkoutPage.enterRandomEmailInTheEmailField();
        checkoutPage.selectDataFromCountryDropDown(3);
        checkoutPage.enterDataInTheCityField("London");
        checkoutPage.enterDataInTheAddress1Field("123 Abc Avenue");
        checkoutPage.enterDataInTheZipPostalCodeField("AB12CD");
        checkoutPage.enterDataInTheMobileNumberField("07912312312");
        checkoutPage.clickOnContinueButton();

        shippingOption.clickOnNextDayAirButton();
        shippingOption.clickOnContinueButton();

        paymentMethod.clickOnCreditCardRadioButton();
        paymentMethod.clickOnContinueButton();

        paymentInfo.selectCreditCardType(1);
        paymentInfo.inputCardHoldersName("John Smith");
        paymentInfo.inputCardNumber("4700 1234 5678 7840");
        paymentInfo.inputExpireMonth("10");
        paymentInfo.inputExpireYear("2030");
        paymentInfo.inputCardCode("999");
        paymentInfo.clickOnContinueButton();

        Thread.sleep(4000);
        confirmOrder.verifyPaymentMethodOption("Credit Card");
        Thread.sleep(4000);
        confirmOrder.verifyShippingMethodOption("Next Day Air");
        Thread.sleep(4000);
        confirmOrder.verifyTotalAmountComputersField("$2,950.00");
        Thread.sleep(4000);
        confirmOrder.clickOnConfirmButton();

        checkoutComplete.verifyThankYouMessage();
        checkoutComplete.verifyOrderProcessedSuccessfullyMessage();
        checkoutComplete.clickOnContinueButton();

        welcomePage.verifyTheWelcomeToStoreDisplayMessage();
















    }









    }


