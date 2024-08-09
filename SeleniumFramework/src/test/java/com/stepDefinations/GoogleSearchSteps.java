package com.stepDefinations;

import com.pages.GoogleSearchPage;
import tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps extends BaseTest {

    private GoogleSearchPage googleSearchPage;

    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        googleSearchPage = new GoogleSearchPage(driver);
        captureScreenshot("GoogleSearchPage");
    }

    @When("User enters {string} in the search box")
    public void user_enters_keyword_in_the_search_box(String keyword) {
        googleSearchPage.enterSearchKeyword(keyword);
        captureScreenshot("EnteredSearch-" + keyword);
    }

    @Then("User should see search results for {string}")
    public void user_should_see_search_results_for_keyword(String keyword) {
        captureScreenshot("SearchResults-" + keyword);
    }
}
