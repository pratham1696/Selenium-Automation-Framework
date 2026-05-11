package com.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DownloadInvoiceTest extends UserAuthHelper {
	@Test
	public void downloadInvoice() {
		weburl();
		loginUser("TestPratham@gmail.com", "Hello@123");
		WebElement products = driver.findElement(By.xpath("//ul/li/a[contains(@href, '/products')]"));
		products.click();
		sleep(2);
		WebElement addtoCart1 = driver.findElement(By.xpath("//a[@data-product-id='1']"));
		addtoCart1.click();
		sleep(2);

		WebElement continueShopping = driver.findElement(By.xpath("//button[contains(@class, 'close-modal')]"));
		continueShopping.click();
		sleep(2);
		WebElement cart = driver
				.findElement(By.xpath("//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']"));
		cart.click();
		sleep(2);

		checkOut1("Need Order Urgently", "Sample", "4700 1189 8888 8890", "898", "06", "2027");
		WebElement downloadInvoice = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
		downloadInvoice.click();
		sleep(2);
		WebElement continuebutton = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		continuebutton.click();
		sleep(2);
		WebElement deleteaccount = driver.findElement(By.xpath("//a[@href = '/delete_account']"));
		deleteaccount.click();
		sleep(2);
		WebElement continuebutton1 = driver.findElement(By.xpath("//a[contains(@class , 'btn-primary')]"));
		continuebutton1.click();
		sleep(2);
	}
}
