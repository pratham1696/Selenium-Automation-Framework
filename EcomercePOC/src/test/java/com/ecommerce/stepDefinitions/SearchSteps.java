package com.ecommerce.stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.pages.SearchPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	WebDriver driver;
	SearchPage searchPage;

	public SearchSteps() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		searchPage = new SearchPage(driver);
	}

	@Given("I open the application")
	public void i_open_the_application() {
		driver.get("http://automationexercise.com");
	}

	@When("I navigate to the Products page ecommerce")
	public void i_navigate_to_the_products_page() {
		searchPage.navigateToProductsPage();
	}

	@Then("User should be navigated to 'ALL PRODUCTS' page successfully")
	public void userShouldBeNavigatedToAllProductsPageSuccessfully() {
		WebElement allProductsHeading = driver.findElement(By.xpath("//h2[normalize-space()='All Products']"));
		Assert.assertTrue("All Products heading is not displayed", allProductsHeading.isDisplayed());
	}

	@Then("I search for {string}")
	public void i_search_for(String product) {
		searchPage.searchForProduct(product);
	}

	@When("I add the first product with ID {string} to the cart")
	public void i_add_the_first_product_to_the_cart(String productId) {
		searchPage.addProductToCart(productId);
	}

	@Then("I continue shopping ecommerce")
	public void i_continue_shopping() {
		searchPage.continueShopping();
	}

	@When("I view the cart ecommerce")
	public void i_view_the_cart() {
		searchPage.viewCart();
	}

	@Then("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		searchPage.navigateToLoginPage();
	}

	@When("I enter email {string}")
	public void i_enter_email(String email) {
		WebElement emailField = driver.findElement(By.xpath("//input[contains(@data-qa,'login-email')]"));
		emailField.sendKeys(email);
	}

	@Then("I enter password {string}")
	public void i_enter_password(String password) {
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys(password);
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@data-qa,'login-button')]"));
		loginButton.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(), 'Logout')]")));
	}

	@Then("I view the cart again")
	public void i_view_the_cart_again() {
		searchPage.viewCart();
	}

	@When("I remove the All product from the cart")
	public void i_remove_the_all_product_from_the_cart() throws InterruptedException {
		java.util.List<WebElement> removeButtons = driver.findElements(By.xpath("//i[@class='fa fa-times']"));

		for (WebElement removeButton : removeButtons) {
			removeButton.click();
			Thread.sleep(1000);
		}
	}

	@Then("{string} should be visible")
	public void should_be_visible(String message) {
		WebElement emptyCartMessage = driver.findElement(By.xpath("//*[contains(text(), 'Cart is empty!')]"));
		Assert.assertTrue(message + " is not displayed", emptyCartMessage.isDisplayed());
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}