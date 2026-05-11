package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ProductQuantityTest extends WebDriverTest {
	@Test
	public void quantity() {
		weburl();
		WebElement viewProduct = driver.findElement(By.xpath("//ul/li/a[contains(@href, '/product_details/1')]"));
		viewProduct.click();
		sleep(2);
		WebElement quantity = driver.findElement(By.name("quantity"));
		Actions actions = new Actions(driver);
		actions.moveToElement(quantity).click();
		sleep(2);
		for (int i = 0; i < 3; i++) {
			actions.sendKeys(Keys.ARROW_UP).perform();
		}
		sleep(2);
		WebElement addtocart = driver
				.findElement(By.xpath("//button[@type='button']//i[@class='fa fa-shopping-cart']"));
		addtocart.click();
		sleep(2);
		WebElement viewCart = driver.findElement(By.xpath("//u[normalize-space()='View Cart']"));
		viewCart.click();
		sleep(4);

	}
}
