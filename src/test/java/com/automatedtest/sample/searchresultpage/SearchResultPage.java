package com.automatedtest.sample.searchresultpage;

import com.automatedtest.sample.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {

    @FindBy(css = "span[data-search-count=openrestaurants]")
    private WebElement result;

    @FindBy(css = "h1[class=c-locationHeader-title]")
    private WebElement location;

    SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    boolean isResultFound(String postCode) {
        wait.forElementToBeDisplayed(10, result, "number of restaurants");
        return location.getText().startsWith(postCode);
    }

}

