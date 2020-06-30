$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ApiTest.feature");
formatter.feature({
  "line": 1,
  "name": "ApiTest",
  "description": "",
  "id": "apitest",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5764970100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Get Success Response",
  "description": "",
  "id": "apitest;get-success-response",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@apiTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Send Get Request",
  "keyword": "Given "
});
formatter.match({
  "location": "ApiTestSteps.sendGetRequest()"
});
formatter.result({
  "duration": 3863946200,
  "status": "passed"
});
formatter.after({
  "duration": 317900500,
  "status": "passed"
});
formatter.uri("CreateAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Create Account",
  "description": "",
  "id": "create-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4511215300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create Account and Order",
  "description": "",
  "id": "create-account;create-account-and-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@create_account_give_an_order_then_check_the_order"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Navigate to to HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click Sign In Button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter Email address to create an Account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Create New Account",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Check Login is Success",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Dresses Button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Summer Dresses button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on first item on Summer Dresses Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Check page with item name \"Printed Summer Dress\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on Add to cart button on Summer Dress Page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enter summer to search textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click on second item on Search Page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Add to cart button on Search Page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click on Cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click on Proceed to Checkout button on Summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click on Proceed to Checkout button on Address page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click on Checkbox on Shipping page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Click on Proceed to Checkout button on Shipping page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click on any payment method button on Payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click on Confirm button on Payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Check the success order message is \"Your order on My Store is complete.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Check the success order from Order History And Details Page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.navigateTooHomePage()"
});
formatter.result({
  "duration": 9706519400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.clickSignInButton()"
});
formatter.result({
  "duration": 2276385100,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStep.clickSignInOnTheMainPage()"
});
formatter.result({
  "duration": 495358100,
  "status": "passed"
});
formatter.match({
  "location": "AccountCreationStep.clickSignInOnTheMainPage()"
});
formatter.result({
  "duration": 22345400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"id_gender1\"}\n  (Session info: chrome\u003d83.0.4103.116)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 20 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027TR-00000044\u0027, ip: \u0027192.168.2.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:49467}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5), userDataDir\u003dC:\\Users\\ehamdog\\AppData\\Local\\Temp\\scoped_dir27280_31306}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d83.0.4103.116, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 0189ad23cf30686605eabe3e2ffcdbe1\n*** Element info: {Using\u003did, value\u003did_gender1}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:393)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:214)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat hepsiburada.challange.pages.AccountCreationPage.SelectGender(AccountCreationPage.java:19)\r\n\tat hepsiburada.challange.steps.AccountCreationStep.clickSignInOnTheMainPage(AccountCreationStep.java:17)\r\n\tat ✽.And Create New Account(CreateAccount.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageStep.loginCheck()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnDressesButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnSummerDressesButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnFirstItemOnSummerDressesPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 27
    }
  ],
  "location": "HomePageStep.checkSummerPageWithItemName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnAddToCartButtonOnSummerDressPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.enterSummerToSearchTextbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnSecondItemOnSearchPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnAddToCartButtonOnSearchPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnProceedToCheckoutButtonOnSummaryPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnProceedToCheckoutButtonOnAddressPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnCheckboxOnShippingPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnProceedToCheckoutButtonOnShippingPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnAnyPaymentMethodButtonOnPaymentPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.clickOnConfirmButtonOnPaymentPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete.",
      "offset": 36
    }
  ],
  "location": "HomePageStep.checkTheSuccessOrderMessageIs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStep.checkTheSuccessOrderFromOrderHistoryAndDetailsPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("Create Account and Order");
formatter.after({
  "duration": 896365500,
  "status": "passed"
});
});