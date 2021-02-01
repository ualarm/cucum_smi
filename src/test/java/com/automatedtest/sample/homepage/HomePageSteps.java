package com.automatedtest.sample.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class HomePageSteps {
    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^I want food in \"([^\"]*)\"$")
    public void iWantFood(String postalCode)
    {
        this.homePage.goToHomePage();
        this.homePage.postCode = postalCode;
    }

    @When("^I search for restaurants$")
    public void iSearchFor() {
        this.homePage.searchFor();
    }

    @Then("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeError(String message)
    {
        Assert.assertTrue("found error message ", this.homePage.isErrorFound(message));
    }
}
