package hepsiburada.challange.base;

import static io.restassured.RestAssured.given;

import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import io.restassured.response.Response;

public class ApiRequest {
    private RequestSpecification request;
    public void getRequest() {
        Response response = given()
                .when()
                .get("http://generator.swagger.io/api/swagger.json");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
}
