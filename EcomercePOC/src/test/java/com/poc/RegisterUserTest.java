package com.poc;

import org.testng.annotations.Test;

public class RegisterUserTest extends UserAuthHelper {
	@Test
	public void registeruser() {
		weburl();
		sleep(2);
		registerUser("Test", "TestDj@gmail.com", "Hell@321", "25", 6, "1998", "Test", "Demo", "Infogain", "66-162",
				"neeladri nagar", "India", "Maharastra", "Mumbai", "400033", "+91 8789651118");
		deleteAccount();

	}
}
