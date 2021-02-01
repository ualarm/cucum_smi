package com.automatedtest.sample.homepage;

import com.automatedtest.sample.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{

    private static final String HOME_PAGE_URL = "http://www.just-eat.co.uk/";
    public String postCode;

    @FindBy(css = "#errorMessage")
    private WebElement errorMessage;

    @FindBy(css = "button[type=submit]")
    private WebElement searchButton;

    @FindBy(css = "input[name=postcode]")
    private WebElement searchInput;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    void searchFor() {
        this.searchInput.clear();
        this.searchInput.sendKeys(postCode);
        this.searchButton.click();
    }

    boolean isErrorFound(String message) {
        wait.forElementToBeDisplayed(10, errorMessage, "search error message");
        return errorMessage.getText().equals(message);
    }
}
