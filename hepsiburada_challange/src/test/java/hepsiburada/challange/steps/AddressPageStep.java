package hepsiburada.challange.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import hepsiburada.challange.pages.AddressPage;
import hepsiburada.challange.pages.PaymentPage;

public class AddressPageStep {
    private AddressPage addressPage;

    public AddressPageStep() {
        this.addressPage = new AddressPage();
    }

    @And("Click Proceed to Checkout button on Address page")
    public void clickOnProceedToCheckoutButtonOnAddressPage() {
        this.addressPage.ClickProceedToCheckOutButtonOnAddressPage();
    }

}
