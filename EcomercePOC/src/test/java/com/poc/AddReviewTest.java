package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddReviewTest extends WebDriverTest {
	@Test
	public void addreview() {
		weburl();
		WebElement products = driver.findElement(By.xpath("//ul/li/a[contains(@href,'/products')]"));
		products.click();
		WebElement productdetail = driver.findElement(By.xpath("//ul/li/a[contains(@href,'/product_details/2')]"));
		productdetail.click();
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Prathamesh");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Pratham@gmail.com");
		WebElement review = driver.findElement(By.id("review"));
		review.sendKeys("The Quality & Material of the product is awesome");
		WebElement reviewButton = driver.findElement(By.id("button-review"));
		reviewButton.click();

	}
}
