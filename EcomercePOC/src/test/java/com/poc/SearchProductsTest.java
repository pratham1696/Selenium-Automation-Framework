package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchProductsTest extends WebDriverTest {
  @Test
  public void searchProducts() {
	  weburl();
	  WebElement products = driver.findElement(By.xpath("//ul/li/a[contains(@href, '/products')]"));
	  products.click();
	  sleep(2);
	  WebElement searchProduct = driver.findElement(By.id("search_product"));
	   searchProduct.sendKeys("Tshirt");
	   sleep(2);
	  WebElement product1 = driver.findElement(By.xpath("//a[contains(@data-product-id, '28')]"));
	  product1.click();
	  sleep(2);
	  WebElement continueShopping = driver.findElement(By.xpath("//button[contains(@class, 'close-modal')]"));
	  continueShopping.click();
	  sleep(2);
      WebElement viewCart= driver.findElement(By.xpath("//ul/li/a[contains(@href, 'view_cart')]"));
	  viewCart.click();
	  sleep(2);
	  WebElement loginElement = driver.findElement(By.xpath("//ul/li/a[contains(@href, 'login')]"));
	  loginElement.click();
      sleep(2);
      WebElement email = driver.findElement(By.xpath("//input[contains(@data-qa,'login-email')]"));
      email.sendKeys("jaswanth.jr@gmail.com");
      sleep(2);
      WebElement password = driver.findElement(By.name("password"));
      password.sendKeys("Hello@123");
      sleep(2);
      WebElement loginbutton = driver.findElement(By.xpath("//button[contains(@data-qa,'login-button')]"));
      loginbutton.click();
      sleep(2);
      WebElement viewCart1 = driver.findElement(By.xpath("//ul/li/a[contains(@href, 'view_cart')]"));
	  viewCart1.click();
	  sleep(2);
	  WebElement removeProducts = driver.findElement(By.xpath("//a[contains(@class, 'cart_quantity_delete') and (@data-product-id = 28)]"));
	  removeProducts.click();
	  sleep(2);
	  
  }
}
