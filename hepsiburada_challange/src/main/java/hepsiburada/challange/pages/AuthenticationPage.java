package hepsiburada.challange.pages;

import hepsiburada.challange.base.BasePage;
import org.openqa.selenium.support.PageFactory;

import static hepsiburada.challange.keywords.WebElements.AuthenticatonKeys.emailCreateTextbox;
import static hepsiburada.challange.keywords.WebElements.AuthenticatonKeys.submitCreateButton;

public class AuthenticationPage extends BasePage {
    public AuthenticationPage() {
        PageFactory.initElements(driver, this);
    }

    public void EnterMail(String mail) {
        driver.findElement(emailCreateTextbox).sendKeys(mail);
    }

    public void ClickSubmitCreateButton() {
        driver.findElement(submitCreateButton).click();
    }
}
