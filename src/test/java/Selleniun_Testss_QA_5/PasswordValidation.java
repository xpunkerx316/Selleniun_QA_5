package Selleniun_Testss_QA_5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PasswordValidation {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","/Users/x_punker_x/Downloads/ffd/geckodriver");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		
	  }
		
	@Test
	public void Tests1() {
   	
		browser.findElement(By.name("characters")).sendKeys("Steve123");

		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).toString();
		 String  Expected="Valid Value";
		 assertEquals(Expected,result);

	}
	@Test
	public void Tests2() {
   	
		browser.findElement(By.name("characters")).sendKeys("F@di316");

		 browser.findElement(By.name("validate")).click();
		 String result= browser.findElement(By.name("validation_message")).toString();
		 String  Expected="Invalid Value";
		 assertEquals(Expected,result);

	}

}
