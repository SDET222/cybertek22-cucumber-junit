package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wiki_StepDefinitions {
    WikiSearchPage ws = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {



    }


    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        ws.searchBox.sendKeys(arg0+ Keys.ENTER);

    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {

    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expHeader) {

        String actHeader = ws.mainHeader.getText();
        Assert.assertEquals(expHeader,actHeader);
    }
}
