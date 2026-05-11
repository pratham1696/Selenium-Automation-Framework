package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators for elements on the login page
	private By emailField = By.name("email");
	private By passwordField = By.name("password");
	private By loginButton = By.xpath("//button[contains(text(),'Login')]");

	// Methods to interact with elements
	public void enterUsername(String username) {
		driver.findElement(emailField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
}
