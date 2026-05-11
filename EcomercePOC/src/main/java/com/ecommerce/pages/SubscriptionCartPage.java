package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SubscriptionCartPage {
	private WebDriver driver;
	private JavascriptExecutor js;

	// Locators
	private By cart = By.xpath("//ul/li/a[contains(@href, '/view_cart')]");
	private By subscriptionEmailField = By.id("susbscribe_email");
	private By subscribeButton = By.id("subscribe");

	// Constructor
	public SubscriptionCartPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) driver;
	}

	// Methods
	public void navigateToCart() {
		driver.findElement(cart).click();
	}

	public void scrollToBottom() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void enterSubscriptionEmail(String email) {
		driver.findElement(subscriptionEmailField).sendKeys(email);
	}

	public void clickSubscribeButton() {
		driver.findElement(subscribeButton).click();
	}
}