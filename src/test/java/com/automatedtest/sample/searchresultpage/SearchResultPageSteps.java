package com.automatedtest.sample.searchresultpage;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchResultPageSteps {

    private SearchResultPage searchResultPage;

    public SearchResultPageSteps() {
        this.searchResultPage = new SearchResultPage();
    }

    @Then("^I should see some restaurants in \"([^\"]*)\"$")
    public void iShouldSeeResults(String postCode)
    {
        Assert.assertTrue("found some restaurants at " + postCode, this.searchResultPage.isResultFound(postCode));
    }

}
