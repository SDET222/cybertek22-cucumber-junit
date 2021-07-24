package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //Creating the private constructor, so this class objects are not reachable from outside
    private Driver() {


    }
    // making driver instance private so that is not reachable from outside of the class
    //We make it static because we want it to run before everything else and
    // we will use it in a static method
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
    //creating reusable utility method that will return same 'diver' instance every time we call
    public static WebDriver getDriver() {

        if(driverPool.get()==null) {

            String browserType = ConfigurationReader.getProperty("browser");
            switch(browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }
        }
        // sane driver instance will be returned every time we call Driver.getDriver() method
        return driverPool.get();
    }

    /**
     * Thjis method makes sure we have some form of driver session or driver id.
     * Null or not null it must exist.
     */
    public static void closeDriver() {
        if(driverPool.get()!=null) {
            driverPool.get().quit();
            driverPool.remove();
        }


    }


}
