package hepsiburada.challange.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import hepsiburada.challange.utils.DriverUtil;

public class BaseStep {


    @Before
    public void setup() throws Exception {
        String browserName=System.getProperty("browserName");
        System.out.println(browserName);
        DriverUtil.setWebDriver(browserName);
    }

    @After
    public void tearDown(Scenario scenario) {
        DriverUtil.quitDriver(scenario);
    }

}
