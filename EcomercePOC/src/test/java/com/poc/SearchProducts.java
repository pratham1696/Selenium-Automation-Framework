package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchProducts extends WebDriverTest {
  @Test
  public void search() {
	   weburl();
	   sleep(2);
	   WebElement products = driver.findElement(By.xpath("//ul/li/a[contains(@href,'/products')]"));
	   products.click();
	   sleep(2);
	   WebElement searchProduct = driver.findElement(By.id("search_product"));
	   searchProduct.sendKeys("shirt");
	   sleep(2);
	   WebElement search = driver.findElement(By.id("submit_search"));
	   search.click();
	   sleep(4);
	   
  }
}
