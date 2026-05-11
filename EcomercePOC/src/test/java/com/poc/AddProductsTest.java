package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddProductsTest extends WebDriverTest {
	@Test
	public void addProducts() {
		weburl();

		WebElement products = driver.findElement(By.xpath("//ul/li/a[contains(@href, '/products')]"));
		products.click();
		sleep(2);
		WebElement addtoCart1 = driver.findElement(By.xpath("//a[@data-product-id='1']"));
		addtoCart1.click();
		sleep(2);
		WebElement continueShopping = driver.findElement(By.xpath("//button[contains(@class, 'close-modal')]"));
		continueShopping.click();
		sleep(2);
		WebElement addtoCart2 = driver.findElement(By.xpath("//a[@data-product-id='2']"));
		addtoCart2.click();
		sleep(2);
		WebElement viewCart = driver.findElement(By.xpath("//u[normalize-space()='View Cart']"));
		viewCart.click();
		sleep(4);
		WebElement checkout = driver.findElement(By.xpath("//a[contains(text(), 'Proceed To Checkout')]"));
		checkout.click();
		sleep(2);

//	  WebElement cart1 = driver.findElement(By.xpath("//*[text()='View Cart']"));
//		cart1.click();
//		sleep(2);
//		WebElement checkout1 = driver.findElement(By.xpath("//a[contains(@class, 'check_out')"));
//		checkout1.click();
//		sleep(2);
//		WebElement message = driver.findElement(By.name("message"));
//		message.sendKeys("Need Order Urgently");
//		sleep(2);
//		WebElement placeorder = driver.findElement(By.xpath("//a[contains(@href, '/payment')]"));
//		placeorder.click();
//		sleep(2);
	}
}
