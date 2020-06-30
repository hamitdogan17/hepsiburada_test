package hepsiburada.challange.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import hepsiburada.challange.pages.HomePage;
import hepsiburada.challange.pages.PaymentPage;

public class PaymentPageStep {
    private PaymentPage paymentPage;

    public PaymentPageStep() {
        this.paymentPage = new PaymentPage();
    }

    @And("Select payment method")
    public void clickOnAnyPaymentMethodButtonOnPaymentPage() {
        this.paymentPage.ClickPaymentMethodButtonOnPaymentPage();
    }

    @And("Click Confirm button")
    public void clickOnConfirmButtonOnPaymentPage() {
        this.paymentPage.ClickCofirmButtonOnPaymentPage();
    }
}
