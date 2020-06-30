package hepsiburada.challange.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import hepsiburada.challange.pages.AddressPage;
import hepsiburada.challange.pages.ShippingPage;

public class ShippingPageStep {
    private ShippingPage shippingPage;

    public ShippingPageStep() {
        this.shippingPage = new ShippingPage();
    }

    @Then("Click Checkbox on Shipping page")
    public void clickOnCheckboxOnShippingPage() {
        this.shippingPage.ClickCheckboxOnShippingPage();
    }

    @And("Click Proceed to Checkout button on Shipping page")
    public void clickOnProceedToCheckoutButtonOnShippingPage() {
        this.shippingPage.ClickProceedToCheckOutButtonOnShippingPage();
    }
}
