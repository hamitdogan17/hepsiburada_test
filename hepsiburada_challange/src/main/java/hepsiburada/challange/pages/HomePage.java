package hepsiburada.challange.pages;


import hepsiburada.challange.base.BasePage;
import hepsiburada.challange.keywords.WebElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static hepsiburada.challange.keywords.WebElements.Keywords.*;
import static org.junit.Assert.assertTrue;

public class HomePage extends BasePage implements WebElements {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void navigateToHomePage() {
        getDriver().get(HOME_PAGE_URL);
    }

    private static final String HOME_PAGE_URL = "http://automationpractice.com/";


    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void checkUsername(String username) {
        String usernameText = driver.findElement(userNameLabel).getText();
        assertTrue(usernameText.contains(username));
    }

    public void ClickDressesButton() {
        driver.findElement(dressesButton).click();
    }

    public void ClickFirstItemButton() {
        driver.findElement(firstItemButton).click();
    }

    public void checkCasualDressesPage(String itemLabelName) {
        String itemlabelNameText = driver.findElement(itemNameLabelOnItemDetailPage).getText();
        assertTrue(itemlabelNameText.contains(itemLabelName));
    }

    public void ClickSummerDressesButton() {
        driver.findElement(summerDressesButton).click();
    }

    public void ClickSummerDressPageFirstItemButton() {
        driver.findElement(summerDressPageFirstItemButton).click();
    }

    public void checkSummerDressesPage(String summerDressPageItemLabelName) {
        String summerDressPageItemLabelNameText = driver.findElement(itemNameLabelOnSummerDressItemDetailPage).getText();
        assertTrue(summerDressPageItemLabelNameText.contains(summerDressPageItemLabelName));
    }

    public void ClickSummerDressesAddToCartButton() {
        driver.findElement(summerDressesAddToCartButton).click();
    }

    public void EnterSummer(String text) {
        driver.findElement(searchTextbox).sendKeys(text);
    }

    public void ClickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void checkSearchPage(String searchItemLabelName) {
        String searchItemLabelNameText = driver.findElement(itemNameLabelOnSearchPage).getText();
        assertTrue(searchItemLabelNameText.contains(searchItemLabelName));
    }

    public void ClickSearchPageSecondItemButton() {
        driver.findElement(searchPageSecondItemButton).click();
    }

    public void ClickAddToCartonSearchPageButton() {
        driver.findElement(searchPageAddToCartButton).click();
    }

    public void ClickViewMyShoppingCartButton() {
        driver.findElement(viewMyShoppingCartButton).click();
    }

    public void ClickCheckOutButton() {
        driver.findElement(checkOutButton).click();
    }

    public void ClickProceedToCheckOutButtonOnInformationPopup() {
        driver.findElement(proceedToCheckoutButtonOnInformationPopupForOrder).click();
    }

    public void ClickProceedToCheckOutButtonOnSummaryPage() {
        driver.findElement(proceedToCheckoutButtonOnSummaryPage).click();
    }

    public void checkSuccessOrderMessage(String successOrderMessage) {
        String orderMessageText = driver.findElement(successAlertMessageForOrderLabel).getText();
        assertTrue(orderMessageText.contains(successOrderMessage));
    }

    public void clickUserNameLabel() {
        driver.findElement(userNameLabel).click();
    }

    public void clickOrderHistoryAndDetailsButton() {
        driver.findElement(orderHistoryAndDetailsButton).click();
    }

    public void checkLastOrder() {
        if( driver.findElement(lastOrder).isDisplayed()){
            System.out.println("Order is successful");
        }
        else {
            System.out.println("Order is not successful!");
            Assert.fail();
        }
    }

    public void CheckSuccessOrderFromOrderHistoryAndDetailsPage() {
        clickUserNameLabel();
        clickOrderHistoryAndDetailsButton();
        checkLastOrder();
    }
}
