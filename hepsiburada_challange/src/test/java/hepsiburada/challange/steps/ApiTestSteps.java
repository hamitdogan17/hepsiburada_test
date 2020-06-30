package hepsiburada.challange.steps;

import cucumber.api.java.en.Given;
import hepsiburada.challange.base.ApiRequest;

public class ApiTestSteps {
    @Given("Send Get Request")
    public void sendGetRequest() {
        ApiRequest apiRequest = new ApiRequest();

        apiRequest.getRequest();
    }
}
