package com.cybertek.step_definitions;


import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    //import from io.cucumber.java
   @Before
    public void setupScenario(){
       System.out.println("<<<Setting up browser with further details>>>");
   }

    @After
    public void tearDownScenario() {
        System.out.println("<<<Tear down steps are being applied>>>");
        Driver.closeDriver();
    }


}
