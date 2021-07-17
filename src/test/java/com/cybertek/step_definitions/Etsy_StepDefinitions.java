package com.cybertek.step_definitions;
import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class Etsy_StepDefinitions {
    EtsySearchPage es = new EtsySearchPage();

    @Given("user is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        String url =  "https://www.etsy.com/" ;
        Driver.getDriver().get(url);
    }
    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String expTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actTitle.equals(expTitle));
    }
    @When("user types Wooden Spoon in the search bar")
    public void user_types_wooden_spoon_in_the_search_bar() {

        es.searchBox.sendKeys("Wooden Spoon");

    }
    @When("user click to search button")
    public void user_click_to_search_button() {
        es.submitButton.click();
    }
    @Then("user sees title is Wooden Spoon")
    public void user_sees_title_is_wooden_spoon() {
        String actTitle = Driver.getDriver().getTitle();
        String expTitle = "Wooden spoon | Etsy";
        Assert.assertEquals("Title is not as expected",expTitle,actTitle);
    }




}
