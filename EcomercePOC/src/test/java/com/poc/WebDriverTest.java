package com.poc;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class WebDriverTest {
	
 protected WebDriver driver; 
  @BeforeClass
  public void  setupDriver() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
  protected void sleep(int seconds) {
	  try {
		Thread.sleep(seconds*1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Test
  public void weburl()
  {
	  driver.get("https://automationexercise.com/");
	  driver.manage().window().maximize();
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
