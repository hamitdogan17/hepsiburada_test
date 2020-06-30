package hepsiburada.challange.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hepsiburada.challange.pages.HomePage;

public class HomePageStep {
    private HomePage homePage;

    public HomePageStep() {
        this.homePage = new HomePage();
    }

    @Given("Navigate to to HomePage")
    public void navigateTooHomePage() {
        homePage.navigateToHomePage();
    }

    @Then("Click Sign In Button")
    public void clickSignInButton() {
        this.homePage.clickSignInButton();
    }

    @Then("Is Login successfull")
    public void loginCheck() {
        this.homePage.checkUsername("Hamit");
    }

    @When("Click Dresses Button")
    public void clickOnDressesButton() {
        this.homePage.ClickDressesButton();
    }

    @Then("Select first item on Casual Dresses Page")
    public void clickOnFirstItemOnCasualDressesPage() {
        this.homePage.ClickFirstItemButton();
    }

    @Then("^Page check with item name \"([^\"]*)\"$")
    public void pageCheckWithItemName(String itemNameText) {
        this.homePage.checkCasualDressesPage(itemNameText);
    }

    @And("Click Summer Dresses button")
    public void clickOnSummerDressesButton() {
        this.homePage.ClickSummerDressesButton();
    }

    @And("Select any item on Summer Dresses Page")
    public void clickOnFirstItemOnSummerDressesPage() {
        this.homePage.ClickSummerDressPageFirstItemButton();
    }

    @Then("Check page with item name \"([^\"]*)\"$")
    public void checkSummerPageWithItemName(String summerDressItemNameText) {
        this.homePage.checkSummerDressesPage(summerDressItemNameText);
    }

    @When("Click Add to cart button on Summer Dress Page")
    public void clickOnAddToCartButtonOnSummerDressPage() {
        this.homePage.ClickSummerDressesAddToCartButton();
    }

    @When("Enter summer to search textbox")
    public void enterSummerToSearchTextbox() {
        this.homePage.EnterSummer("summer");
    }

    @When("Click search button")
    public void clickOnSearchButton() {
        this.homePage.ClickSearchButton();
    }

    @Then("Check Search page with item name \"([^\"]*)\"$")
    public void checkSearchPageWithItemName(String searchItemNameText) {
        this.homePage.checkSearchPage(searchItemNameText);
    }

    @And("Click second item on Search Page")
    public void clickOnSecondItemOnSearchPage() {
        this.homePage.ClickSearchPageSecondItemButton();
    }

    @And("Click Add to cart button on Search Page")
    public void clickOnAddToCartButtonOnSearchPage() {
        this.homePage.ClickAddToCartonSearchPageButton();
    }

    @And("Click Cart button")
    public void clickOnCartButton() {
        this.homePage.ClickViewMyShoppingCartButton();
    }

    @Then("Click Check Out button")
    public void clickOnCheckOutButton() {
        this.homePage.ClickCheckOutButton();
    }

    @And("Click Proceed to Checkout button on Information Popup for Order")
    public void clickOnProceedToCheckoutButtonOnInformationPopupForOrder() {
        this.homePage.ClickProceedToCheckOutButtonOnInformationPopup();
    }

    @And("Click Proceed to Checkout button on Summary page")
    public void clickOnProceedToCheckoutButtonOnSummaryPage() {
        this.homePage.ClickProceedToCheckOutButtonOnSummaryPage();
    }

    @Then("Check the order message is \"([^\"]*)\"$")
    public void checkTheSuccessOrderMessageIs(String successOrderMessage) {
        this.homePage.checkSuccessOrderMessage(successOrderMessage);
    }

    @Then("Check the order from Order History And Details Page")
    public void checkTheSuccessOrderFromOrderHistoryAndDetailsPage() {
        this.homePage.CheckSuccessOrderFromOrderHistoryAndDetailsPage();
    }


}
