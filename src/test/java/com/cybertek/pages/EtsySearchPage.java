package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {

    public EtsySearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css ="#global-enhancements-search-query")
   public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit' and @value='Search']")
    public WebElement submitButton;
}
