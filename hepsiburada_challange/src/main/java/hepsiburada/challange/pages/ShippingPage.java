package hepsiburada.challange.pages;

import hepsiburada.challange.base.BasePage;
import hepsiburada.challange.keywords.WebElements;
import org.openqa.selenium.support.PageFactory;

import static hepsiburada.challange.keywords.WebElements.Keywords.*;

public class ShippingPage extends BasePage implements WebElements {
    public ShippingPage() {
        PageFactory.initElements(driver, this);
    }

    public void ClickCheckboxOnShippingPage() {
        driver.findElement(proceedToCheckboxOnShippingPage).click();
    }

    public void ClickProceedToCheckOutButtonOnShippingPage() {
        driver.findElement(proceedToCheckoutButtonOnShippingPage).click();
    }
}
