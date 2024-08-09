package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchBox;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchKeyword(String keyword) {
        searchBox.clear();
        searchBox.sendKeys(keyword);
        searchBox.submit();
    }
}
