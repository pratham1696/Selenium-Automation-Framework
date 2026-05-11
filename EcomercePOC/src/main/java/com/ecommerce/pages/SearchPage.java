
package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	private By productsLink = By.xpath("//ul/li/a[contains(@href, '/products')]");
	private By searchField = By.id("search_product");

	private By addToCartButtonById(String productId) {
		return By.xpath("//a[@data-product-id='" + productId + "']");
	}

	private By continueShoppingButton = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
	private By viewCartButton = By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']");
	private By loginLink = By.xpath("//ul/li/a[contains(@href, 'login')]");

	public void navigateToProductsPage() {
		driver.findElement(productsLink).click();
	}

	public void searchForProduct(String product) {
		WebElement searchBox = driver.findElement(searchField);
		searchBox.sendKeys(product);
		searchBox.sendKeys(Keys.ENTER);
	}

	public void addProductToCart(String productId) {
		// This is 100% Java code, using Selenium's built-in JavascriptExecutor
		WebElement addToCart = driver.findElement(By.xpath("//a[@data-product-id='" + productId + "']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCart);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCart);
	}

	public void continueShopping() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton));
		button.click();
	}

	public void viewCart() {
		driver.findElement(viewCartButton).click();
	}

	public void navigateToLoginPage() {
		driver.findElement(loginLink).click();
	}
}