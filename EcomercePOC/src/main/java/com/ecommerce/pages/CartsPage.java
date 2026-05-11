package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartsPage {
	WebDriver driver;

	// Constructor
	public CartsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators for elements on the cart page
	private By productsLink = By.xpath("//ul/li/a[contains(@href, '/products')]");
	private By viewCart = By.xpath("//*[text()='View Cart']");
	private By checkout = By.xpath("//a[contains(@class, 'check_out')]");
	private By continueShopping = By.xpath("//button[contains(@class, 'close-modal')]");
	private By totalPrice = By.xpath("(//*[@class='total'])");

	// Methods to interact with elements
	public void navigateToProducts() {
		driver.findElement(productsLink).click();
		sleep(2);
	}

	public void addProductToCart(String productId) {
		// This is 100% Java code, using Selenium's built-in JavascriptExecutor
		WebElement addToCart = driver.findElement(By.xpath("//a[@data-product-id='" + productId + "']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCart);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCart);
		sleep(2);
	}

	public void continueShopping() {
		driver.findElement(continueShopping).click();
		sleep(2);
	}

	public void viewCart() {
		driver.findElement(viewCart).click();
		sleep(2);
	}

	public boolean verifyProductInCart(String productId) {
		By product = By.xpath("//*[contains(@id,'product-" + productId + "')]");
		return driver.findElement(product).isDisplayed();
	}

	public boolean verifyPricesAndTotal() {
		WebElement total = driver.findElement(totalPrice);
		return !total.getText().isEmpty();
	}

	public void proceedToCheckout() {
		driver.findElement(checkout).click();
		sleep(2);
	}

	// Utility sleep method
	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
