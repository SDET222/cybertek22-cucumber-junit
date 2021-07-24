package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;



public  class GoogleStepDefinitions {
    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://www.google.com/");
    }



    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "Google";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @When("User searches for {string}")
    public void user_searches_for(String string) {
        GoogleSearchPage s = new GoogleSearchPage();
        s.searchBox.sendKeys(string + Keys.ENTER);
    }
    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = string;
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

}
