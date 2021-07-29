package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBear_OrderPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class SmartBear_StepDefinitions {
    SmartBear_OrderPage page = new SmartBear_OrderPage();

    String url = ConfigurationReader.getProperty("smartBearUrl");

    @Given("User is logged in to SmartBear {string} account")
    public void user_is_logged_in_to_account(String string) {
        Driver.getDriver().get(url);
        page.usernameInput.sendKeys(ConfigurationReader.getProperty("sbUserName"));
        page.passwordInput.sendKeys(ConfigurationReader.getProperty("sbPassword"));
        page.loginBtn.click();


    }
    @Given("User navigate to {string} page")
    public void user_navigate_to_page(String string) {
        page.orderPageBtn.click();
    }

    @Given("User fill out below information")
    public void user_fill_out_below_information(Map<String,String> data) {
        Select select = new Select(page.productDropdown);
        select.selectByValue(data.get("product dropdown"));
        page.quantity.sendKeys(data.get("quantity"));
        page.customerName.sendKeys(data.get("customer name"));
        page.street.sendKeys(data.get("street"));
        page.city.sendKeys(data.get("city"));
        page.zip.sendKeys(data.get("zipCode"));
        page.visa.sendKeys(data.get("Card type"));
        page.visa.click();
        page.cardNumber.sendKeys(data.get("card number"));
        page.expirationDate.sendKeys(data.get("expiration date"));



    }
    @Given("User click process button")
    public void user_click_process_button() {
        page.processBtn.click();

    }

    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {
        page.allOrdersBtn.click();


    }




}
