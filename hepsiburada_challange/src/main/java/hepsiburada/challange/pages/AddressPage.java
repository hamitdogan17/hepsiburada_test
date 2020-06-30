package hepsiburada.challange.pages;

import hepsiburada.challange.base.BasePage;
import hepsiburada.challange.keywords.WebElements;
import org.openqa.selenium.support.PageFactory;

import static hepsiburada.challange.keywords.WebElements.Keywords.*;

public class AddressPage extends BasePage implements WebElements {
    public AddressPage() {
        PageFactory.initElements(driver, this);
    }

    public void ClickProceedToCheckOutButtonOnAddressPage() {
        driver.findElement(proceedToCheckoutButtonOnAddressPage).click();
    }
}
