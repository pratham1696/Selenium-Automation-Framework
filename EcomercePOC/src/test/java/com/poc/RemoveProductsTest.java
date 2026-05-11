package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RemoveProductsTest extends WebDriverTest {
	@Test
	public void removeProducts() {
		weburl();
		WebElement product = driver.findElement(By.xpath("//a[@href='/products']"));
		product.click();
//		WebElement addtoCart1 = driver.findElement(By.linkText("Add to cart'1'"));
//		addtoCart1.click();
		WebElement addToCart = driver.findElement(By.xpath("//a[@data-product-id='1']"));
		addToCart.click();

		sleep(2);
		WebElement cart = driver.findElement(By.xpath("//*[text()='View Cart']"));
		cart.click();
		sleep(2);
//		WebElement checkout = driver.findElement(By.xpath("//a[contains(@class, 'check_out')"));
//		checkout.click();
//		sleep(2);
		java.util.List<WebElement> removeButtons = driver.findElements(By.xpath("//a[@class='cart_quantity_delete']"));

		for (WebElement removeButton : removeButtons) {
			removeButton.click();
		}
	}
}
