SeleniumFramework/
¦
+-- src/
¦   +-- main/
¦   ¦   +-- java/
¦   ¦   ¦   +-- com/
¦   ¦   ¦   ¦   +-- pages/
¦   ¦   ¦   ¦   ¦   +-- BasePage.java
¦   ¦   ¦   ¦   ¦   +-- GoogleSearchPage.java
¦   ¦   ¦   ¦   +-- utils/
¦   ¦   ¦   ¦       +-- BrowserFactory.java
¦   ¦   ¦   ¦       +-- ConfigReader.java
¦   ¦   ¦   ¦       +-- ScreenshotUtil.java
¦   ¦   ¦   ¦       +-- ExtentManager.java
¦   ¦   ¦   +-- tests/
¦   ¦   ¦       +-- BaseTest.java
¦   ¦   ¦       +-- GoogleSearchTest.java
¦   +-- test/
¦       +-- java/
¦       ¦   +-- com/
¦       ¦   ¦   +-- stepDefinitions/
¦       ¦   ¦   ¦   +-- GoogleSearchSteps.java
¦       ¦   ¦   +-- runners/
¦       ¦   ¦       +-- TestRunner.java
¦       +-- resources/
¦           +-- features/
¦           ¦   +-- GoogleSearch.feature
¦           +-- extent-config.xml
¦           +-- config.properties
¦
+-- pom.xml
+-- runTests.bat
+-- README.md


Explanation of the Framework
BasePage.java: Contains the common methods used by all page classes.
GoogleSearchPage.java: Contains methods related to Google search page interactions.
BrowserFactory.java: Manages browser initialization.
ConfigReader.java: Reads configuration properties like browser type, URLs, etc.
ScreenshotUtil.java: Captures screenshots and stores them.
ExtentManager.java: Configures and manages Extent Reports.
BaseTest.java: Contains common test setup and teardown methods.
GoogleSearchTest.java: Defines the Google search test case.
GoogleSearchSteps.java: Contains step definitions for the Cucumber feature.
TestRunner.java: Runs the Cucumber tests with TestNG.
GoogleSearch.feature: Cucumber feature file defining the search scenarios.
extent-config.xml: Configures the Extent Report.
config.properties: Stores configuration values.
runTests.bat: Batch file to run tests with different browser parameters.


Run Tests from Command Line:

Open a terminal and navigate to the SeleniumFramework directory.
Execute the following command to run tests on Chrome (or any other browser by replacing chrome):

batch
runTests.bat chrome

Viewing the Reports:

After the tests run, an Extent Report will be generated in the test-output folder. Open extent-report.html to view the detailed report with screenshots.

Explanation

Page Object Model (POM): This framework follows the POM design pattern, where each web page is represented by a class, containing all elements and actions related to that page.
Extent Reports: The framework uses Extent Reports for detailed reporting, including screenshots for each step.
Cucumber with TestNG: Cucumber is integrated with TestNG to run BDD-style test cases, and TestNG manages test execution.
Maven: Maven handles dependencies and builds the project. The tests can be run using Maven commands from batch files, supporting different browsers via parameters.
