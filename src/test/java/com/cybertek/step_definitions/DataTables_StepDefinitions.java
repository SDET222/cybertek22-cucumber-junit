package com.cybertek.step_definitions;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils1;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    LibraryLoginPage loginPage = new LibraryLoginPage();

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {

        System.out.println("listOfFruits = " + listOfFruits);
        System.out.println("listOfFruits.size() = " + listOfFruits.size());

    }
    @Given("user is on login page of library app")
    public void user_is_on_login_page_of_library_app() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }

    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String,String> credentials) {
        loginPage.emailInput.sendKeys(credentials.get("username"));
        loginPage.passwordInput.sendKeys(credentials.get("password"));
        loginPage.signInBtn.click();
        BrowserUtils1.sleep(2);
    }

    @Then("user should see title is Library")
    public void user_shoul_see_title_is_Library() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";

        Assert.assertEquals(expectedTitle,actualTitle);


    }




}
