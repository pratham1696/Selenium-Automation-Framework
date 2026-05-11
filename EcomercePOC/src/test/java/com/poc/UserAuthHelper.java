package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserAuthHelper extends WebDriverTest {

	public void loginUser(String username, String password) {

		if (driver == null) {
			throw new IllegalStateException("WebDriver is not initialized!");
		}
		WebElement loginElement = driver.findElement(By.xpath("//a[contains(@href, '/login')]"));
		loginElement.click();
		sleep(2);
		WebElement email = driver.findElement(By.xpath("//input[contains(@data-qa,'login-email')]"));
		email.sendKeys(username);
		sleep(2);
		WebElement password1 = driver.findElement(By.name("password"));
		password1.sendKeys(password);
		sleep(2);
		WebElement loginbutton = driver.findElement(By.xpath("//button[contains(@data-qa,'login-button')]"));
		loginbutton.click();
		sleep(2);
	}

	public void logOut() {
		WebElement logoutbutton = driver.findElement(By.xpath("//a[contains(@href, '/logout')]"));
		logoutbutton.click();
	}

	public void registerUser(String name, String email, String password, String day, int month, String year,
			String firstname, String lastname, String company, String add1, String add2, String ctry, String state,
			String city, String zipcode, String mobile) {
		weburl();
		WebElement registerElement = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		registerElement.click();
		sleep(2);
		WebElement nameElement = driver.findElement(By.name("name"));
		nameElement.sendKeys(name);
		sleep(2);
		WebElement emailElement = driver.findElement(By.xpath("//input[contains(@data-qa , 'signup-email')]"));
		emailElement.sendKeys(email);
		sleep(2);
		WebElement signup = driver.findElement(By.xpath("//button[contains(@data-qa , 'signup-button')]"));
		signup.click();
		sleep(2);
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys(password);
		sleep(2);
		Select date = new Select(driver.findElement(By.name("days")));
		date.selectByValue(day);
		sleep(2);
		Select month1 = new Select(driver.findElement(By.id("months")));
		month1.selectByIndex(month);
		Select year1 = new Select(driver.findElement(By.name("years")));
		year1.selectByValue(year);
		sleep(2);
		WebElement checkbox1 = driver.findElement(By.xpath("//input[contains(@id , 'newsletter')]"));
		checkbox1.click();
		sleep(2);
		WebElement checkbox2 = driver.findElement(By.xpath("//input[contains(@id , 'optin')]"));
		checkbox2.click();
		sleep(2);
		WebElement firstname1 = driver.findElement(By.name("first_name"));
		firstname1.sendKeys(firstname);
		sleep(2);
		WebElement lastname1 = driver.findElement(By.name("last_name"));
		lastname1.sendKeys(lastname);
		sleep(2);
		WebElement company1 = driver.findElement(By.name("company"));
		company1.sendKeys(company);
		sleep(2);
		WebElement address1 = driver.findElement(By.name("address1"));
		address1.sendKeys(add1);
		sleep(2);
		WebElement address2 = driver.findElement(By.name("address2"));
		address2.sendKeys(add2);
		sleep(2);
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue(ctry);
		sleep(2);
		WebElement state1 = driver.findElement(By.name("state"));
		state1.sendKeys(state);
		sleep(2);
		WebElement city1 = driver.findElement(By.name("city"));
		city1.sendKeys(city);
		sleep(2);
		WebElement zipcode1 = driver.findElement(By.name("zipcode"));
		zipcode1.sendKeys(zipcode);
		sleep(2);
		WebElement mobile1 = driver.findElement(By.name("mobile_number"));
		mobile1.sendKeys(mobile);
		sleep(2);
		WebElement create = driver.findElement(By.xpath("//button[contains(@data-qa , 'create-account')]"));
		create.click();
		sleep(2);
		WebElement continuebutton = driver.findElement(By.xpath("//a[contains(@data-qa , 'continue-button')]"));
		continuebutton.click();
	}

	public void logoutUser() {
		driver.findElement(By.id("logout-button")).click();
	}

	public void deleteAccount() {
		WebElement deleteaccount = driver.findElement(By.xpath("//a[@href = '/delete_account']"));
		deleteaccount.click();
		sleep(2);
		WebElement continuebutton1 = driver.findElement(By.xpath("//a[contains(@class , 'btn-primary')]"));
		continuebutton1.click();
		sleep(2);
	}

	public void checkOut(String message, String cardName, String cardNumber, String cvc, String expireMonth,
			String expireYear) {

		WebElement cart = driver
				.findElement(By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']"));
		cart.click();
		sleep(2);

		WebElement checkout = driver.findElement(By.xpath("//a[contains(text(), 'Proceed To Checkout')]"));
		checkout.click();
		sleep(2);

		WebElement login = driver.findElement(By.xpath("//*[text()='Register / Login']"));
		login.click();
		loginUser("demo_sessiontest@email.com", "demo_sessiontest@123");
		sleep(5);

		cart = driver.findElement(By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']"));
		cart.click();
		sleep(2);

		WebElement checkout1 = driver.findElement(By.xpath("//a[contains(text(), 'Proceed To Checkout')]"));
		checkout1.click();
		sleep(2);

		WebElement message1 = driver.findElement(By.name("message"));
		message1.sendKeys(message);
		sleep(2);

		WebElement placeorder = driver.findElement(By.xpath("//a[contains(@href, '/payment')]"));
		placeorder.click();
		sleep(2);

		WebElement cardName1 = driver.findElement(By.name("name_on_card"));
		cardName1.sendKeys(cardName);
		sleep(2);

		WebElement cardNumber1 = driver.findElement(By.name("card_number"));
		cardNumber1.sendKeys(cardNumber);
		sleep(2);

		WebElement cvc1 = driver.findElement(By.name("cvc"));
		cvc1.sendKeys(cvc);
		sleep(2);

		WebElement expireMonth1 = driver.findElement(By.name("expiry_month"));
		expireMonth1.sendKeys(expireMonth);
		sleep(2);

		WebElement expireYear1 = driver.findElement(By.name("expiry_year"));
		expireYear1.sendKeys(expireYear);
		sleep(2);

		WebElement placeorderandpay = driver.findElement(By.xpath("//button[@id='submit']"));
		placeorderandpay.click();
		sleep(2);

	}

	public void checkOut1(String message, String cardName, String cardNumber, String cvc, String expireMonth,
			String expireYear) {

		WebElement checkout2 = driver.findElement(By.xpath("//a[contains(text(), 'Proceed To Checkout')]"));
		checkout2.click();
		sleep(2);

		WebElement message1 = driver.findElement(By.name("message"));
		message1.sendKeys(message);
		sleep(2);

		WebElement placeorder = driver.findElement(By.xpath("//a[contains(@href, '/payment')]"));
		placeorder.click();
		sleep(2);

		WebElement cardName1 = driver.findElement(By.name("name_on_card"));
		cardName1.sendKeys(cardName);
		sleep(2);

		WebElement cardNumber1 = driver.findElement(By.name("card_number"));
		cardNumber1.sendKeys(cardNumber);
		sleep(2);

		WebElement cvc1 = driver.findElement(By.name("cvc"));
		cvc1.sendKeys(cvc);
		sleep(2);

		WebElement expireMonth1 = driver.findElement(By.name("expiry_month"));
		expireMonth1.sendKeys(expireMonth);
		sleep(2);

		WebElement expireYear1 = driver.findElement(By.name("expiry_year"));
		expireYear1.sendKeys(expireYear);
		sleep(2);

		WebElement placeorderandpay = driver.findElement(By.xpath("//button[@id='submit']"));
		placeorderandpay.click();
		sleep(2);

	}
}
