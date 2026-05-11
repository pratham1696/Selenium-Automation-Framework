package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginBeforeCheckoutTest extends UserAuthHelper {
	@Test
	public void loginBeforeCheckout() {
		weburl();
		sleep(2);
		loginUser("TestPratham@gmail.com", "Hello@123");
		WebElement products = driver.findElement(By.xpath("//ul/li/a[contains(@href, '/products')]"));
		products.click();
		sleep(2);
		WebElement addtoCart1 = driver.findElement(By.xpath("//a[@data-product-id='1']"));
		addtoCart1.click();
		sleep(2);
		WebElement viewCart = driver.findElement(By.xpath("//u[normalize-space()='View Cart']"));
		viewCart.click();
		sleep(4);
		checkOut1("Need Order asap", "Sample", "4700 1189 8888 8890", "898", "06", "2029");
	}
}
