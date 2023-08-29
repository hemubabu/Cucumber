package com.baseclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver Driver;
	
	   @SuppressWarnings("deprecation")
	public void launch(String url) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver(options); 
		Driver.manage().window().maximize();
		Driver.get(url);
	   
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
