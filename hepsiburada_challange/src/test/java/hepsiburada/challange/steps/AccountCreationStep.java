package hepsiburada.challange.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import hepsiburada.challange.pages.AccountCreationPage;
import hepsiburada.challange.utils.DriverUtil;

public class AccountCreationStep {
    private AccountCreationPage accountCreationPage;

    public AccountCreationStep() {
        this.accountCreationPage = new AccountCreationPage();
    }

    @Given("^Create New Account$")
    public void clickSignInOnTheMainPage() throws Throwable {
        accountCreationPage.SelectGender();
        accountCreationPage.EnterCustomerFirstname("Hamit");
        accountCreationPage.EnterCustomerLastname("Dogan");
        accountCreationPage.EnterPassword("123456789");
        accountCreationPage.SelectDay("28");
        accountCreationPage.SelectMonth("1");
        accountCreationPage.SelectYear("1992");
        accountCreationPage.SelectNewsletterCheckbox();
        accountCreationPage.SelectreceiveOfferCheckbox();

        accountCreationPage.EnterFirstname("Hamit");
        accountCreationPage.EnterLastname("Dogan");
        accountCreationPage.EnterAddress1("xyz");
        accountCreationPage.Entercity("ABC");
        accountCreationPage.SelectState("2");
        accountCreationPage.EnterZipCode("34265");
        accountCreationPage.EnterMobilePhone("5353333333");
        accountCreationPage.EnterMyAddressField("Home");
        accountCreationPage.ClickRegisterButton();
    }
}
