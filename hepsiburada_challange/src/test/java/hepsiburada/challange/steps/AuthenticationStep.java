package hepsiburada.challange.steps;

import cucumber.api.java.en.Given;
import hepsiburada.challange.pages.AuthenticationPage;

import java.security.SecureRandom;

public class AuthenticationStep {
    private AuthenticationPage accountCreationPage;

    public AuthenticationStep() {
        this.accountCreationPage = new AuthenticationPage();
    }
    public static String createdEmail;

    @Given("^Enter Email address to create an Account$")
    public void clickSignInOnTheMainPage() throws Throwable {
        createdEmail = "xyzfsd" + generateRandomNumber(8) +  "@gmail.com";
        accountCreationPage.EnterMail(createdEmail);
        accountCreationPage.ClickSubmitCreateButton();
    }

    private String generateRandomNumber(int count) {
        String numberSet = "123456789";
        StringBuilder builder = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        while (count-- != 0) {
            int index = (int) (secureRandom.nextDouble() * numberSet.length());
            builder.append(numberSet.charAt(index));
        }
        return builder.toString();
    }
}
