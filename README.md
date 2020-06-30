# hepsiburada_test
## Test Automation With Java, Cucumber and Selenium WebDriver

## Installation
You need to have Java 8 JDK installed along with maven.

You can run test on Chrome or firefox browser

To install all dependencies, run
 > mvn clean install 
 
 ## Running Test
 
 For running test 
 > mvn test 
 > mvn verify
 
 if you want to run tests different browsers you should write this code
  > mvn test -DbrowserName=chrome
  > mvn test -DbrowserName=firefox
