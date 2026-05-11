package com.ecommerce.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ExtentTest test;
    public static WebDriver driver;

    @Before
    public void setup(Scenario scenario) {
        test = extent.createTest(scenario.getName());
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            test.fail("Test Failed");
        } else {
            test.pass("Test Passed");
        }
        extent.flush();
        driver.quit();
    }
}
