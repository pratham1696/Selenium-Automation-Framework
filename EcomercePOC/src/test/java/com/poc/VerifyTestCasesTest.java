package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyTestCasesTest extends WebDriverTest {
  @Test
  public void verifyTestCases() {
	  weburl();
	  sleep(2);
	  WebElement testcases = driver.findElement(By.xpath("//ul/li/a[contains(@href, 'test_cases')]"));
	  testcases.click();
	  
  }
}
