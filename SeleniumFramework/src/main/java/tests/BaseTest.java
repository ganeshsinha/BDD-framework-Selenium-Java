package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.utils.BrowserFactory;
import com.utils.ConfigReader;
import com.utils.ExtentManager;
import com.utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;
    protected ConfigReader configReader;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) {
        // Initialize configuration reader and ExtentReports
        configReader = new ConfigReader();
        extent = ExtentManager.getInstance();
        
        // Create a new test entry in the Extent Report
        test = ExtentManager.createTest(getClass().getSimpleName());
        
        // Initialize the WebDriver based on the browser parameter
        driver = BrowserFactory.getBrowser(browser);
        
        // Navigate to the base URL from the configuration
        driver.get(configReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        // Quit the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
        
        // Flush the Extent Reports
        if (extent != null) {
            extent.flush();
        }
        
        // Remove the ExtentTest instance from ThreadLocal
        ExtentManager.removeTest();
    }

    /**
     * Captures a screenshot for the current test step and adds it to the Extent Report.
     *
     * @param stepName Name of the test step or action for which the screenshot is captured.
     */
    protected void captureScreenshot(String stepName) {
        String screenshotPath = ScreenshotUtil.captureScreenshot(driver, stepName);
        test.addScreenCaptureFromPath(screenshotPath);
    }
}
