package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegisterBeforeCheckoutTest extends UserAuthHelper {
	@Test
	public void registerAfterCheckout() {
		registerUser("Test", "TestR@gmail.com", "Hello@123", "20", 6, "1998", "Jaswanth", "Reddy", "Infogain", "45-142",
				"Cotton Colony", "India", "Maharastra", "Mumbai", "400033", "+91 9182021459");

		WebElement product1 = driver.findElement(By.xpath("//a[@href='/products']"));
		product1.click();
		sleep(2);
		WebElement addtoCart1 = driver.findElement(By.xpath("//a[@data-product-id='1']"));
		addtoCart1.click();
		sleep(2);
		WebElement viewCart = driver.findElement(By.xpath("//u[normalize-space()='View Cart']"));
		viewCart.click();
		sleep(4);
		checkOut1("Need Order Urgently", "Sample", "4700 1189 8888 8890", "898", "06", "2027");
		deleteAccount();
	}
}
