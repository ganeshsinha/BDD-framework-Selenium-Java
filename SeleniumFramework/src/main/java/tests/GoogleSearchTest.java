package tests;

import com.pages.GoogleSearchPage;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void searchGoogleForMultipleData() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        String[] searchKeywords = {"Selenium", "Cucumber", "TestNG"};

        for (String keyword : searchKeywords) {
            googleSearchPage.enterSearchKeyword(keyword);
            captureScreenshot("SearchResult-" + keyword);
        }
    }
}
