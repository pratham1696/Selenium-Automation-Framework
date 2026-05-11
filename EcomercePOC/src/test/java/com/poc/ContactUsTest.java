package com.poc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactUsTest extends WebDriverTest {
	@Test
	public void contactUs() {
		weburl();
		sleep(2);
		WebElement contactUs = driver.findElement(By.xpath("//a[contains(@href,'contact_us')]"));
		contactUs.click();
		sleep(2);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Prathamesh");
		sleep(2);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Prathamesh1@gmail.com");
		sleep(2);
		WebElement subject = driver.findElement(By.name("subject"));
		subject.sendKeys("Account Issue");
		sleep(2);
		WebElement textarea = driver.findElement(By.xpath("//textarea[contains(@name, 'message')]"));
		textarea.sendKeys("Issue with the account password ");
		sleep(2);
		WebElement file = driver.findElement(By.name("upload_file"));
		file.sendKeys("C:/Users/Prathamesh.d/Downloads/Ecommerce1.pdf");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		sleep(2);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		sleep(2);
		WebElement home = driver.findElement(By.xpath("//a[contains(@href,'/')]"));
		home.click();

	}
}
