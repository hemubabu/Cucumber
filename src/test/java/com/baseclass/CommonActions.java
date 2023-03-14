package com.baseclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonActions {
	public static WebDriver Driver;
	
	   @SuppressWarnings("deprecation")
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\FebCucumber\\ChromeDriver\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}
	public void clickElement(WebElement element) {
		element.click();
		
	}
	public void insertText(WebElement element,String input) {
		element.sendKeys(input,Keys.ENTER);
				
	}
	public void quitBrowser() {
		Driver.quit();
	}

}
