package com.ecommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ecommerce.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	LoginPage loginPage;

	public LoginSteps() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}

	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		driver.get("https://automationexercise.com/login");
	}

	@When("User enters valid username {string}")
	public void user_enters_valid_username(String username) {
		loginPage.enterUsername(username);
	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		System.out.println("Successfully logged in!");
		// Add validation to ensure user is logged in successfully, like checking a
		// logout button or user name on the page.
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
