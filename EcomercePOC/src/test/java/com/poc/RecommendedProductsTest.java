package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RecommendedProductsTest extends WebDriverTest {
	@Test
	public void recommendedProducts() {
		weburl();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		sleep(10);
		WebElement product = driver.findElement(By.xpath("//div[@class='recommended_items']//a[@data-product-id='1']"));
		product.click();
		sleep(2);
		WebElement viewCart = driver.findElement(By.xpath("//u[normalize-space()='View Cart']"));
		viewCart.click();
		sleep(2);

	}
}
