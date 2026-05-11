package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class SubscriptionHomePage extends WebDriverTest {
	@Test
	public void verifySubscription() {
		weburl();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		sleep(3);
		By subscription = By.id("susbscribe_email");
		driver.findElement(subscription).sendKeys("test.demo@gmail.com");
		sleep(3);
		By subscribeButton = By.id("subscribe");
		driver.findElement(subscribeButton).click();
		sleep(2);
	}
}
