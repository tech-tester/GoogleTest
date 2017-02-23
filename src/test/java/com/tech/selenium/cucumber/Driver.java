package com.tech.selenium.cucumber;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.HashMap;

public class Driver {

    public static WebDriver driver;


    @BeforeClass
    public static void initialiseDriver(){

        System.setProperty("webdriver.chrome.driver","selenium_browser_drivers/windowsChromedriver/chromedriver.exe");
        DesiredCapabilities chromeCapabilites = new DesiredCapabilities();

        chromeCapabilites.setCapability("chrome.switches", Arrays.asList("--no-default-browser-check"));
        HashMap<String, String> chromePreferences = new HashMap<String, String>();
        chromePreferences.put("profile.password_manager_enabled", "false");
        chromeCapabilites.setCapability("chrome.prefs", chromePreferences);

        driver = new ChromeDriver(chromeCapabilites);
    }



}
