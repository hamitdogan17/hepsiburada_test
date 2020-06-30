package hepsiburada.challange.utils;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import hepsiburada.challange.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DriverUtil {
    public static WebDriver driver;

    public static void setWebDriver(String browser) throws Exception {

        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }

    public static void quitDriver(Scenario scenario){
        if(scenario.isFailed()){
            saveScreenshotsForScenario(scenario);
        }
        driver.close();
    }

    private static void saveScreenshotsForScenario(final Scenario scenario) {

        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            String testName = scenario.getName();
            scenario.embed(screenshot, "image/png");
            scenario.write(testName);
        } catch (WebDriverException wde) {
            System.err.println(wde.getMessage());
        } catch (ClassCastException cce) {
            cce.printStackTrace();
        }/*

        final byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");*/
    }
}
