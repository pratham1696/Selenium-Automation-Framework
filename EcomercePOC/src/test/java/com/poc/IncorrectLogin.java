package com.poc;

import org.testng.annotations.Test;

public class IncorrectLogin extends UserAuthHelper{
		  @Test
		  public void Login() {
			  weburl();
			  sleep(2);
			  loginUser("hello@gmail.com", "Hello@123");
		  }
}
