package com.ecommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ecommerce.pages.CartsPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {

	WebDriver driver;
	CartsPage cartsPage;

	public CartSteps() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		cartsPage = new CartsPage(driver);
	}

	@Given("I open the applications ecommerce")
	public void i_open_the_applications_ecommerce() {
		driver.get("http://automationexercise.com");
	}

	@When("I navigate to the Products page")
	public void i_navigate_to_the_products_page() {
		cartsPage.navigateToProducts();
	}

	@Then("I add the product with ID {string} to the cart")
	public void i_add_the_product_with_id_to_the_cart(String productId) {
		cartsPage.addProductToCart(productId);
	}

	@Then("I continue shopping")
	public void i_continue_shopping() {
		cartsPage.continueShopping();
	}

	@When("I view the cart")
	public void i_view_the_cart() {
		cartsPage.viewCart();
	}

	@Then("I verify both products are added to the cart")
	public void i_verify_both_products_are_added_to_the_cart() {
		if (!(cartsPage.verifyProductInCart("1") && cartsPage.verifyProductInCart("2"))) {
			throw new AssertionError("One or both products are missing from the cart.");
		}
	}

	@Then("I verify their prices, quantity, and total price")
	public void i_verify_their_prices_quantity_and_total_price() {
		if (!cartsPage.verifyPricesAndTotal()) {
			throw new AssertionError("Price, quantity, or total price verification failed.");
		}
	}

	@Then("I proceed to checkout")
	public void i_proceed_to_checkout() {
		cartsPage.proceedToCheckout();
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
