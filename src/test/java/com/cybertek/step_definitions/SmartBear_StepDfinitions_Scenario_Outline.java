package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBear_OrderPage;
import com.cybertek.utilities.BrowserUtils1;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SmartBear_StepDfinitions_Scenario_Outline {
    SmartBear_OrderPage page = new SmartBear_OrderPage();

    @When("User enters {string} , {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}")
    public void user_enters(String product, String quantity, String customername, String street, String city, String state, String zip, String cardType, String cardnumber, String expirationdate) {

        Select select = new Select(page.productDropdown);
        select.selectByValue(product);
        page.quantity.sendKeys(quantity);
        page.customerName.sendKeys(customername);
        page.street.sendKeys(street);
        page.city.sendKeys(city);
        page.state.sendKeys(state);
        page.zip.sendKeys(zip);
        page.visa.sendKeys(cardType);
        page.visa.click();
        page.cardNumber.sendKeys(cardnumber);
        page.expirationDate.sendKeys(expirationdate);
        page.processBtn.click();
        page.allOrdersBtn.click();
        BrowserUtils1.sleep(2);
        List<String> allNamesText = new ArrayList<>();
        for (WebElement each : page.allNames) {
            allNamesText.add(each.getText());
        Assert.assertTrue(allNamesText.contains(customername));

    }



}
}
