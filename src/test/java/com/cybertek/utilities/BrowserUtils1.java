package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils1 {


    /**
     * Method will accept in
     * Wait for given seconds duration
     */

        public static void sleep(int second)  {
            second *=1000;

            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {
                System.out.println("Something happened in the sleep");
            }

        }

//    public static List<String> getElementsText(List<WebElement> list) {
//
//    }

    /*
    This method accept expected title as argument and assert if it is equal to actual title
     */

    public void assertTitle(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs(expectedTitle));

            String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public boolean equalsTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
       return expectedTitle.equals(actualTitle);
    }














}
