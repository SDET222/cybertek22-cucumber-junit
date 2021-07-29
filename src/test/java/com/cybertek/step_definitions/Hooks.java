package com.cybertek.step_definitions;
import com.cybertek.utilities.BrowserUtils1;
import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    //import from io.cucumber.java
   @Before (value = "@login" , order = 1)

   // before each scenario
    public void setupScenario(){
       System.out.println("<<<Setting up browser with further details>>>");
   }

    @After
    public void tearDownScenario(Scenario scenario) {
        //System.out.println("<<<Tear down steps are being applied>>>");

        //if scenario fails take a screenshot
       // scenario.isFailed();
        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        BrowserUtils1.sleep(2);
       // Driver.closeDriver();
    }



    @BeforeStep("@login")
    public void setupStep(){
        System.out.println("<<<<setup applying for each step>>>>");
    }

    @AfterStep("@login")
    public void afterStep() {
        System.out.println("<<<<teardown applying for each step>>>>>");
    }



}
