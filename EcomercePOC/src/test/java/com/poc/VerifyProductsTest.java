package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifyProductsTest extends WebDriverTest{
  @Test
  public void verifyProucts() {
	  weburl();
	  sleep(2);
	  WebElement products = driver.findElement(By.xpath("//ul/li/a[contains(@href,'/products')]"));
	  products.click();
	  sleep(2);
	  WebElement product1 = driver.findElement(By.xpath("//ul/li/a[contains(@href, '/product_details/1')]"));
	  product1.click();
  }
}
