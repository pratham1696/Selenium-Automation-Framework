package com.poc;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollUpWithoutArrow extends WebDriverTest {
  @Test
  public void f() {
	  weburl();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      sleep(3);
      js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
      sleep(3);
      

  }
}
