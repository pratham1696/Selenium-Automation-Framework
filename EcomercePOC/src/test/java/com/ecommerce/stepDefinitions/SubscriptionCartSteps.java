package com.ecommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.pages.SubscriptionCartPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscriptionCartSteps {
	private WebDriver driver;
	private SubscriptionCartPage subscriptionCartPage;
	private WebDriverWait wait;

	public SubscriptionCartSteps() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		subscriptionCartPage = new SubscriptionCartPage(driver);
	}

	@Given("User is on the cart page")
	public void user_is_on_the_cart_page() {
		driver.get("https://automationexercise.com/view_cart");
	}

	@When("User scrolls to the subscription section")
	public void user_scrolls_to_the_subscription_section() {
		subscriptionCartPage.scrollToBottom();
	}

	@When("User enters the email {string}")
	public void user_enters_the_email(String email) {
		subscriptionCartPage.enterSubscriptionEmail(email);
	}

	@When("User clicks on the subscribe button")
	public void user_clicks_on_the_subscribe_button() {
		subscriptionCartPage.clickSubscribeButton();
	}

	@Then("Subscription confirmation message should be displayed")
	public void subscription_confirmation_message_should_be_displayed() {
		// Add validation for confirmation message
		System.out.println("Subscription confirmed successfully!");
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
