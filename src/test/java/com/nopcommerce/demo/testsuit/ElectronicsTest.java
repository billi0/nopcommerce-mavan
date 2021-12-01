package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

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


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        /*Mouse Hover on “Electronics” Tab, Mouse Hover on “Cell phones” and click
        Verify the text “Cell phones”*/
        homePage.mouseHoverOnElectronicsTabThenMouseHoverOnCellPhonesTabAndClick();
        electronicsCellPhonesPage.verifyCellPhonePageWelcomeTextIsDisplayedCorrectly();
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
    /*2.1 Mouse Hover on “Electronics” Tab
        2.2 Mouse Hover on “Cell phones” and click
        2.3 Verify the text “Cell phones”
        2.4 Click on List View Tab
        2.5 Click on product name “Nokia Lumia 1020” link
        2.6 Verify the text “Nokia Lumia 1020”
        2.7 Verify the price “$349.00”
        2.8 Change quantity to 2 and click on add to cart
        2.9 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        2.10 After that close the bar clicking on the cross button
        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        2.12 Verify the message "Shopping cart"
	    2.13 Verify the quantity is 2
        2.14 Verify the Total $698.00
        2.15 click on checkbox “I agree with the terms of service”
        2.16 click on checkout
        2.17 Verify the Text “Welcome, Please Sign In!”
        2.18 Click on “REGISTER” tab
        2.19 Verify the text register
        2.20 Fill the mandatory fields
        2.21 Click on “REGISTER”
        2.22 Verify the message “Your registration completed”
        2.23 Click on Continue Tab
        2.24 Verify the text "Shopping Cart"
        2.25 click on checkbox “I agree with the terms of service”
        2.26 Click on “CHECKOUT”
        2.27 Fill the mandatory fields and click on continue
        2.28 Click on Radio Button “2nd Day Air($0.00)”
        2.29 Click on “CONTINUE”
        2.30 Select Radio Button “Credit Card”
        2.31 Click on Continue
        2.32 Select “Visa” From Select credit card dropdown and fill all details and click on continue
        2.33 Verify “Payment Method” is “Credit Card”
        2.34 Verify “Shipping Method” is “2nd Day Air”
        2.35 Verify Total is “$698.00”
        2.36 Click on Confirm
        2.37 Verify the Text “Thank You”
        2.38 Verify the message “Your order has been successfully processed!”
        2.39 Click on “CONTINUE”
        2.40 Verify the text “Welcome to our store”
        2.41 Click on “Logout” link
        2.42 Verifying the URL
     */
        verifyUserShouldNavigateToCellPhonesPageSuccessfully();
        electronicsCellPhonesPage.clickOnTheListViewTab();

        cellPhonesListViewPage.clickOnNokiaLumiaLink();

        cellPhonesListViewNokiaLumiaPage.verifyTheTextNokiaLumia();
        cellPhonesListViewNokiaLumiaPage.verifyNokiaLumiaPriceIsDisplayedCorrectly();
        cellPhonesListViewNokiaLumiaPage.clearTextFromTheNokiaLumiaQuantityField();
        cellPhonesListViewNokiaLumiaPage.inputUpdatedQuantityForNokiaLumia1020("2");
        cellPhonesListViewNokiaLumiaPage.clickOnNokiaLumiaAddToCartButton();
        cellPhonesListViewNokiaLumiaPage.verifyTheNokiaLumiaProductAddedToCartMessage();
        cellPhonesListViewNokiaLumiaPage.closeTheGreenBarByClickingTheCrossButton();
        cellPhonesListViewNokiaLumiaPage.mouseHoverOnNokiaLumiaShoppingCartButton();
        cellPhonesListViewNokiaLumiaPage.clickOnNokiaLumiaGoToCartButton();

        shoppingCartPage.verifyShoppingCartDisplayMessage();
        shoppingCartPage.verifyShoppingCartQuantityMessage();
        shoppingCartPage.verifyShoppingCartTotalAmount();
        shoppingCartPage.clickOnCheckBoxTermsOfService();
        shoppingCartPage.clickOnCheckout();

        signInPage.verifyTheSignInDisplayMessage();
        signInPage.clickOnRegisterTab();

        register.verifyTheRegisterDisplayMessage();
        register.enterFirstName("George");
        register.enterLastName("Smith");
        register.enterEmail();
        register.enterPassword("abc123");
        register.enterConfirmPassword("abc123");
        register.clickOnRegisterButton();

        registrationComplete.verifyTheRegisterationCompleteMessage();
        registrationComplete.clickOnTheContinueButton();

        shoppingCart.verifyTheShoppingCartDisplayMessage();
        shoppingCart.clickOnTermsAndConditionsAgreeBox();
        shoppingCart.clickOnCheckoutButton();

        checkoutPage.selectDataFromCountryDropDown(5);
        checkoutPage.enterDataInTheCityField("London");
        checkoutPage.enterDataInTheAddress1Field("123 Abc Avenue");
        checkoutPage.enterDataInTheZipPostalCodeField("HA8 1CC");
        checkoutPage.enterDataInTheMobileNumberField("07912345678");
        checkoutPage.clickOnContinueButton();

        shippingOption.clickOnButton2ndDayAir();
        shippingOption.clickOnContinueButton();

        paymentMethod.clickOnCreditCardRadioButton();
        paymentMethod.clickOnContinueButton();

        paymentInfo.selectCreditCardType(0);
        paymentInfo.inputCardHoldersName("John Smith");
        paymentInfo.inputCardNumber("4700 1234 5678 7840");
        paymentInfo.inputExpireMonth("10");
        paymentInfo.inputExpireYear("2030");
        paymentInfo.inputCardCode("999");
        paymentInfo.clickOnContinueButton();

        confirmOrder.verifyPaymentMethodOption("Credit Card");
        confirmOrder.verifyShippingMethodOption("2nd Day Air");
        confirmOrder.verifyTotalAmountField("$698.00");
        confirmOrder.clickOnConfirmButton();

        checkoutComplete.verifyThankYouMessage();
        checkoutComplete.verifyOrderProcessedSuccessfullyMessage();
        checkoutComplete.clickOnContinueButton();

        welcomePage.verifyTheWelcomeToStoreDisplayMessage();
        welcomePage.clickOnLogOutLink();

        homePage.verifyUrl();
    }
}
