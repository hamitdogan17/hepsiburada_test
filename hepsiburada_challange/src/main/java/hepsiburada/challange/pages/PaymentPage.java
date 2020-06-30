package hepsiburada.challange.pages;

import hepsiburada.challange.base.BasePage;
import hepsiburada.challange.keywords.WebElements;
import org.openqa.selenium.support.PageFactory;

import static hepsiburada.challange.keywords.WebElements.Keywords.confirmButtonOnPaymentPage;
import static hepsiburada.challange.keywords.WebElements.Keywords.paymentTypeButtonOnPaymentPage;

public class PaymentPage extends BasePage implements WebElements {
    public PaymentPage() {
        PageFactory.initElements(driver, this);
    }


    public void ClickPaymentMethodButtonOnPaymentPage() {
        driver.findElement(paymentTypeButtonOnPaymentPage).click();
    }

    public void ClickCofirmButtonOnPaymentPage() {
        driver.findElement(confirmButtonOnPaymentPage).click();
    }
}
