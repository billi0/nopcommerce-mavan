package com.nopcommerce.demo.pages;

public class ElectronicsPage extends HomePage {

    public String getElectronicsPageWelcomeText(){
        return doGetTextFromElement(electronicsMenu);
    }
}
