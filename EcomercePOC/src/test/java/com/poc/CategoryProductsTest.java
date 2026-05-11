package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CategoryProductsTest extends WebDriverTest {
	@Test
	public void category() {
		weburl();
		WebElement Women = driver.findElement(By.xpath("//a[normalize-space()='Women']//i[@class='fa fa-plus']"));
		Women.click();
		sleep(2);
		WebElement category1 = driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(),'Dress')]"));
		category1.click();
		sleep(2);
		WebElement Men = driver.findElement(By.xpath("//a[normalize-space()='Men']//i[@class='fa fa-plus']"));
		Men.click();
		sleep(2);
	}
}
