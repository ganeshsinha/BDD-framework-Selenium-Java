package com.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentReports createInstance(String fileName) {
    	ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Tester", "QA Team");
        extent.setSystemInfo("Environment", "QA");

        return extent;
    }

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = createInstance("test-output/extent-report.html");
        }
        return extent;
    }

    public static ExtentTest createTest(String testName) {
        ExtentTest extentTest = extent.createTest(testName);
        test.set(extentTest);
        return getTest();
    }

    public static ExtentTest getTest() {
        return test.get();
    }

    public static void removeTest() {
        test.remove();
    }
}
