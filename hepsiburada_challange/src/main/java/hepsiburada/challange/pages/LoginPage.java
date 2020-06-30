package hepsiburada.challange.pages;

import hepsiburada.challange.base.BasePage;
import hepsiburada.challange.keywords.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static hepsiburada.challange.keywords.WebElements.LoginKeywords.rootMainPageloginURL;
import static hepsiburada.challange.keywords.WebElements.LoginKeywords.usernameTextbox;
import static hepsiburada.challange.keywords.WebElements.LoginKeywords.passwordTextbox;
import static hepsiburada.challange.keywords.WebElements.LoginKeywords.loginButton;
import static hepsiburada.challange.keywords.WebElements.LoginKeywords.errorMessageToast;

public class LoginPage extends BasePage implements WebElements {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    public void navigateToLogin() {
        getDriver().get(rootMainPageloginURL);
    }

    public void login(String username, String password) {
        clickAndWrite(usernameTextbox, username);
        clickAndWrite(passwordTextbox, password);
        click(loginButton);
    }

    public boolean checkLoginWithWrongCrediantialsToast() {
        waitUntilVisibleByLocator(errorMessageToast);
        return isElementExists(errorMessageToast);
    }


}
