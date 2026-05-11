package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class SubscriptionCartPage extends WebDriverTest {
	@Test
	public void verifySubscription() {
		weburl();
		By cart = By.xpath("//ul/li/a[contains(@href, '/view_cart')]");
		driver.findElement(cart).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		sleep(3);
		By subscription = By.id("susbscribe_email");
		driver.findElement(subscription).sendKeys("testdemo@gmail.com");
		sleep(3);
		By subscribeButton = By.id("subscribe");
		driver.findElement(subscribeButton).click();
		sleep(2);
	}
}
