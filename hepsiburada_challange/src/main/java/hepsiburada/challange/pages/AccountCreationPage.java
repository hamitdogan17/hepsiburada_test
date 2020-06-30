package hepsiburada.challange.pages;

import hepsiburada.challange.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static hepsiburada.challange.keywords.WebElements.AccountCreateKeys.*;

public class AccountCreationPage extends BasePage {
    public AccountCreationPage() {
        PageFactory.initElements(driver, this);
    }

    public void SelectGender() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        fluentWait(genderCheckbox);
        driver.findElement(genderCheckbox).click();
    }

    public void EnterCustomerFirstname(String name) {
        driver.findElement(customerFirstname).sendKeys(name);
    }

    public void EnterCustomerLastname(String name) {
        driver.findElement(customerLastname).sendKeys(name);
    }

    public void EnterPassword(String password) {
        driver.findElement(passwordId).sendKeys(password);
    }

    public void SelectDay(String day) {
        new Select(driver.findElement(days)).selectByValue(day);
    }

    public void SelectMonth(String month) {
        (new Select(driver.findElement(months))).selectByValue(month);
    }

    public void SelectYear(String year) {
        (new Select(driver.findElement(years))).selectByValue(year);
    }

    public void SelectNewsletterCheckbox() {
        driver.findElement(newsletterCheckbox).click();
    }

    public void SelectreceiveOfferCheckbox() {
        driver.findElement(receiveOfferCbx).click();
    }

    public void EnterFirstname(String fname) {
        driver.findElement(firstname).sendKeys(fname);
    }

    public void EnterLastname(String lname) {
        driver.findElement(lastname).sendKeys(lname);
    }

    public void EnterAddress1(String address) {
        driver.findElement(address1).sendKeys(address);
    }

    public void Entercity(String cityName) {
        driver.findElement(city).sendKeys(cityName);
    }

    public void SelectState(String state) {
        (new Select(driver.findElement(stateDropdown))).selectByValue(state);
    }

    public void EnterZipCode(String postCode) {
        driver.findElement(postcode).sendKeys(postCode);
    }

    public void EnterMobilePhone(String mobile) {
        driver.findElement(phoneMobile).sendKeys(mobile);
    }

    public void EnterMyAddressField(String myAddress) {
        driver.findElement(myAddressField).sendKeys(myAddress);
    }

    public void ClickRegisterButton() {
        driver.findElement(submitAccountButton).click();
    }

}
