# Selenium Test Automation Framework

## Overview

This repository contains a robust and scalable Selenium test automation framework designed for cross-browser testing using Java, TestNG, Cucumber, Maven, and Extent Reports. The framework is built to support automated testing of web applications, with a focus on searching multiple data on Google and generating detailed test reports.

## Features

- Page Object Model (POM): Structured using the Page Object Model to enhance code maintainability and reusability.
- Cross-Browser Testing: Supports running tests on multiple browsers (e.g., Chrome, Firefox) through configurable parameters.
- BDD with Cucumber: Implements Behavior-Driven Development (BDD) using Cucumber for writing and executing test cases.
- Extent Reports Integration: Provides comprehensive and visually appealing test reports with screenshots for each test step.
- Parameterized Execution: Allows running tests with different browsers and configurations through Maven commands and batch files.
- Screenshots for Each Step: Automatically captures and attaches screenshots to the Extent Reports for better visibility of test execution.


## Prerequisites

Java 8 or higher
Maven
Selenium WebDriver
ChromeDriver and/or GeckoDriver


## Project Structure

src/main/java/: Contains page classes, utility classes, and base test classes.
src/test/java/: Contains step definitions and test runner classes.
src/test/resources/: Contains feature files for Cucumber and configuration files.
pom.xml: Maven configuration file with dependencies and build settings.
runTests.bat: Batch file to execute tests with different browser parameters.

## Getting Started

Clone the Repository:

bash
Copy code
git clone https://github.com/yourusername/selenium-framework.git
cd selenium-framework
Configure Your Environment:

Update the config.properties file with the appropriate browser settings and base URL.
Run Tests:

To run tests on Chrome, execute:
bash
Copy code
runTests.bat chrome
To run tests on Firefox, execute:
bash
Copy code
runTests.bat firefox
View Reports:

Test reports are generated in the test-output directory. Open extent-report.html to view detailed test results.
