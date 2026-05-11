package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrandProductsTest extends WebDriverTest{
  @Test
  public void brandProduct() {
	  weburl();
	  sleep(2);
	  WebElement brand = driver.findElement(By.xpath("//ul/li/a[contains(@href, '/brand_products/Polo')]"));
	  brand.click();
	  sleep(2);
	  WebElement brand2 = driver.findElement(By.xpath("//ul/li/a[contains(@href, '/brand_products/H&M')]"));
	  brand2.click();
	  sleep(2);
	  
  }
}
