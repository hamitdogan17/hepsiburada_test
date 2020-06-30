package hepsiburada.challange.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface WebElements {
    //ToDo: Sperate them by pages
    interface Keywords{
        By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
        By userNameLabel = By.xpath("(//div[@class='header_user_info'])[1]");
        By dressesButton = By.xpath("(//a[@title='Dresses'])[2]");
        By firstItemButton = By.xpath("//a[@class='product-name' and @title='Printed Dress']");
        By itemNameLabelOnItemDetailPage = By.xpath("//h1[@itemprop='name']");
        By summerDressesButton = By.xpath("(//a[contains(text(),'Summer Dresses')])[3]");
        By summerDressPageFirstItemButton = By.xpath("//a[@class='product-name' and @title='Printed Summer Dress'][1]");
        By itemNameLabelOnSummerDressItemDetailPage = By.xpath("//h1[@itemprop='name']");
        By summerDressesAddToCartButton = By.xpath("//p[@id='add_to_cart']");
        By searchTextbox = By.id("search_query_top");
        By searchButton = By.xpath("//button[@type='submit' and @name='submit_search']");
        By itemNameLabelOnSearchPage = By.xpath("//span[contains(text(),'summer')]");
        By searchPageSecondItemButton = By.xpath("//a[@class='product-name' and @title='Printed Chiffon Dress']");
        By searchPageAddToCartButton = By.xpath("//p[@id='add_to_cart']");
        By secondItemNameLabelOnSearchItemDetailPage = By.xpath("//h1[@itemprop='name']");
        By viewMyShoppingCartButton = By.xpath(" //a[@title='View my shopping cart']");
        By checkOutButton = By.xpath("//a[@id='button_order_cart']");
        By proceedToCheckoutButtonOnInformationPopupForOrder = By.xpath("//a[@class='btn btn-default button button-medium']");
        By proceedToCheckoutButtonOnSummaryPage = By.xpath("(//span[contains(text(), 'Proceed to checkout')])[2]");
        By proceedToCheckoutButtonOnAddressPage = By.xpath("(//span[contains(text(), 'Proceed to checkout')])[2]");
        By proceedToCheckboxOnShippingPage = By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to them unconditionally.')]");
        By proceedToCheckoutButtonOnShippingPage = By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]");
        By paymentTypeButtonOnPaymentPage = By.xpath("//a[@title='Pay by check.']");
        By confirmButtonOnPaymentPage = By.xpath("//span[contains(text(),'I confirm my order')]");
        By successAlertMessageForOrderLabel = By.xpath("//p[@class='alert alert-success']");
        By orderHistoryAndDetailsButton = By.xpath("//span[contains(text(),'Order history and details')]");
        By lastOrder = By.xpath("//tr[@class='first_item ']");
    }
    interface LoginKeywords{
        By signInButton = By.xpath("//a[contains(text(),'Sign in')]");

        String rootMainPageloginURL = ("http://automationpractice.com/");
        By usernameTextbox = By.id("loginPage-input-username");
        By passwordTextbox = By.id("loginPage-input-password");
        By loginButton = By.id("loginPage-button-login");
        By errorMessageToast = By.cssSelector(".toast.toast-error");
    }
    interface AuthenticatonKeys {
        By emailCreateTextbox = By.id("email_create");

        By submitCreateButton = By.id("SubmitCreate");;
    }
    interface AccountCreateKeys{
        By genderCheckbox = By.id("id_gender1");
        By customerFirstname = By.id("customer_firstname");
        By customerLastname = By.id("customer_lastname");
        By passwordId = By.id("passwd");
        By days = By.id("days");
        By months = By.id("months");
        By years = By.id("years");
        By newsletterCheckbox = By.id("newsletter");
        By receiveOfferCbx = By.id("optin");
        By firstname = By.id("firstname");
        By lastname = By.id("lastname");
        By address1 = By.id("address1");
        By city = By.id("city");
        By stateDropdown = By.id("id_state");
        By postcode = By.id("postcode");
        By countryDropdown = By.id("id_country");
        By phoneMobile = By.id("phone_mobile");
        By myAddressField = By.id("alias");
        By submitAccountButton = By.id("submitAccount");
        By accountCreationForm = By.id("account-creation_form");
    }
}
