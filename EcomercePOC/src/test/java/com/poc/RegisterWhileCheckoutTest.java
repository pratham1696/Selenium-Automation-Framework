package com.poc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegisterWhileCheckoutTest extends WebDriverTest {
	@Test
	public void beforeCheckoutTest() {
		weburl();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement product = driver.findElement(By.xpath("//a[@href='/products']"));
		product.click();
		WebElement addtoCart2 = driver.findElement(By.xpath("//a[@data-product-id='1']"));
		addtoCart2.click();
		sleep(2);
		WebElement cart = driver.findElement(By.xpath("//*[text()='View Cart']"));
		cart.click();
		sleep(2);
		WebElement checkout = driver.findElement(By.xpath("//a[contains(text(), 'Proceed To Checkout')]"));
		checkout.click();
		sleep(2);
		WebElement Register = driver.findElement(By.xpath("//*[text()='Register / Login']"));
		Register.click();
		WebElement nameElement = driver.findElement(By.name("name"));
		nameElement.sendKeys("test");
		sleep(2);
		WebElement emailElement = driver.findElement(By.xpath("//input[contains(@data-qa , 'signup-email')]"));
		emailElement.sendKeys("testdemo6@yopmail.com");
		sleep(2);
		WebElement signup = driver.findElement(By.xpath("//button[contains(@data-qa , 'signup-button')]"));
		signup.click();
		sleep(2);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Hello@123");
		sleep(2);
		Select date = new Select(driver.findElement(By.name("days")));
		date.selectByValue("27");
		sleep(2);
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByIndex(7);
		Select year = new Select(driver.findElement(By.name("years")));
		year.selectByValue("1996");
		sleep(2);
		WebElement checkbox1 = driver.findElement(By.xpath("//input[contains(@id , 'newsletter')]"));
		checkbox1.click();
		sleep(2);
		WebElement checkbox2 = driver.findElement(By.xpath("//input[contains(@id , 'optin')]"));
		checkbox2.click();
		sleep(2);
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("Test");
		sleep(2);
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("Demo");
		sleep(2);
		WebElement company = driver.findElement(By.name("company"));
		company.sendKeys("TESTING");
		sleep(2);
		WebElement address1 = driver.findElement(By.name("address1"));
		address1.sendKeys("45-142-27 C3");
		sleep(2);
		WebElement address2 = driver.findElement(By.name("address2"));
		address2.sendKeys("Cotton Green");
		sleep(2);
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("India");
		sleep(2);
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Maharastra");
		sleep(2);
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Mumbai");
		sleep(2);
		WebElement zipcode = driver.findElement(By.name("zipcode"));
		zipcode.sendKeys("400033");
		sleep(2);
		WebElement mobile = driver.findElement(By.name("mobile_number"));
		mobile.sendKeys("+91 9987263434");
		sleep(2);
		WebElement create = driver.findElement(By.xpath("//button[contains(@data-qa , 'create-account')]"));
		create.click();
		sleep(2);
		WebElement continueBtn = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@data-qa , 'continue-button')]")));
		js.executeScript("arguments[0].click();", continueBtn);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Proceed To Checkout')]")))
				.click();
		WebElement message = driver.findElement(By.name("message"));
		message.sendKeys("Need Order Urgently");
		sleep(2);
		driver.findElement(By.xpath("//a[contains(text(), 'Place Order')]")).click();

		WebElement cardName = driver.findElement(By.name("name_on_card"));
		cardName.sendKeys("Sample");
		sleep(2);
		WebElement cardNumber = driver.findElement(By.name("card_number"));
		cardNumber.sendKeys("4700 1111 1111 1111");
		sleep(2);
		WebElement cvc = driver.findElement(By.name("cvc"));
		cvc.sendKeys("123");
		sleep(2);
		WebElement expireMonth = driver.findElement(By.name("expiry_month"));
		expireMonth.sendKeys("12");
		sleep(2);
		WebElement expireYear = driver.findElement(By.name("expiry_year"));
		expireYear.sendKeys("2000");
		sleep(2);
		WebElement placeorderandpay = driver.findElement(By.xpath("//button[contains(@data-qa, 'pay-button')]"));
		placeorderandpay.click();
		sleep(2);
		WebElement deleteaccount = driver.findElement(By.xpath("//a[contains(text(), 'Delete Account')]"));
		deleteaccount.click();
		sleep(2);
		WebElement continuebutton1 = driver.findElement(By.xpath("//a[contains(text(), 'Continue')]"));
		continuebutton1.click();
		sleep(2);
	}
}
