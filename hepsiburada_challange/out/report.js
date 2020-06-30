$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/hepsiburadaChallange/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#@login-feature"
    }
  ],
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24765901200,
  "status": "passed"
});
formatter.before({
  "duration": 167208932500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#  @login-feature-ldap-successful"
    }
  ],
  "line": 5,
  "name": "User login successful",
  "description": "",
  "id": "login;user-login-successful",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Merchant is on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Merchant login with \"Sprint-85\" username, \"Test123!\" password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Merchant should see \"Sprint-85\" username as on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.catalogUserIsOnTheLoginPage()"
});
formatter.result({
  "duration": 9899209701,
  "error_message": "java.lang.NullPointerException\r\n\tat hepsiburada.challange.steps.LoginStep.catalogUserIsOnTheLoginPage(LoginStep.java:30)\r\n\tat ✽.Given Merchant is on the Login Page(src/test/resources/hepsiburadaChallange/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sprint-85",
      "offset": 21
    },
    {
      "val": "Test123!",
      "offset": 43
    }
  ],
  "location": "LoginStep.merchantLoginWithUsernamePassword(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sprint-85",
      "offset": 21
    }
  ],
  "location": "LoginStep.merchantShouldSeeUsernameAsOnHomePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 233557799,
  "status": "passed"
});
formatter.before({
  "duration": 6042052500,
  "status": "passed"
});
formatter.before({
  "duration": 8567230900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User login failed",
  "description": "",
  "id": "login;user-login-failed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Merchant is on the Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Merchant login with \"Sprint-85\" username, \"Test12345!\" password",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Merchant should see Access Denied Message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.catalogUserIsOnTheLoginPage()"
});
formatter.result({
  "duration": 10054408700,
  "error_message": "org.openqa.selenium.remote.SessionNotFoundException: invalid session id\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 17 milliseconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027TR-00000044\u0027, ip: \u0027100.120.40.198\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:49301}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5), userDataDir\u003dC:\\Users\\ehamdog\\AppData\\Local\\Temp\\scoped_dir157400_30439}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d83.0.4103.106, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7977bf2d1f7ee09035c3c0d8c4e17f46\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:162)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:304)\r\n\tat hepsiburada.challange.pages.LoginPage.navigateToLogin(LoginPage.java:15)\r\n\tat hepsiburada.challange.steps.LoginStep.catalogUserIsOnTheLoginPage(LoginStep.java:30)\r\n\tat ✽.Given Merchant is on the Login Page(src/test/resources/hepsiburadaChallange/Login.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sprint-85",
      "offset": 21
    },
    {
      "val": "Test12345!",
      "offset": 43
    }
  ],
  "location": "LoginStep.merchantLoginWithUsernamePassword(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.merchantShouldSeeAccessDeniedMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 292461501,
  "status": "passed"
});
});