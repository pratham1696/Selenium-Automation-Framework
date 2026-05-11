package com.poc;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginUserTest extends UserAuthHelper {
	@BeforeTest
	public void setUp() {
		setupDriver(); // ✅ Ensure WebDriver is initialized
	}

	@Test
	public void Login() {
		weburl();
		sleep(2);
		loginUser("TestPratham@gmail.com", "Hello@123");
		logOut();
	}
}
