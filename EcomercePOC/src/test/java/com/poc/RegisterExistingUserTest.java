package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegisterExistingUserTest extends WebDriverTest {
	@Test
	public void existingUserLogin() {
		weburl();
		sleep(2);
		WebElement registerElement = driver.findElement(By.xpath("//a[contains(@href, '/login')]"));
		registerElement.click();
		sleep(2);
		WebElement nameElement = driver.findElement(By.name("name"));
		nameElement.sendKeys("Test");
		sleep(2);
		WebElement emailElement = driver.findElement(By.xpath("//input[contains(@data-qa , 'signup-email')]"));
		emailElement.sendKeys("TestDemo1@gmail.com");
		sleep(2);
		WebElement signup = driver.findElement(By.xpath("//button[contains(@data-qa , 'signup-button')]"));
		signup.click();
	}
}
