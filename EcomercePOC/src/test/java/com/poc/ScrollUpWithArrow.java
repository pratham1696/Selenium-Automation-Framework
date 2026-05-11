package com.poc;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollUpWithArrow extends WebDriverTest{
  @Test
  public void arrow() {
	  weburl();
	  Actions actions = new Actions(driver);
      JavascriptExecutor js = (JavascriptExecutor) driver;

      // Scroll down using the down arrow key until the bottom of the page is reached
      while (true) {
          actions.sendKeys(Keys.ARROW_DOWN).perform();
          sleep(1); // Adjust sleep time as needed
          long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
          long scrollTop = (long) js.executeScript("return window.pageYOffset + window.innerHeight");
          if (scrollTop >= scrollHeight) {
              break;
          }
      }

      sleep(1); // Sleep for 3 seconds at the bottom

      // Scroll up using the up arrow key until the top of the page is reached
      while (true) {
          actions.sendKeys(Keys.ARROW_UP).perform();
          sleep(1); // Adjust sleep time as needed
          long scrollTop = (long) js.executeScript("return window.pageYOffset");
          if (scrollTop == 0) {
              break;
          }
      }

  }
}
