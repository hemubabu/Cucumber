
package com.w3schools;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.CommonActions;
import com.objectrepository.PageobjectModel;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class W3Schools extends CommonActions{
	CommonActions C = new CommonActions();
	PageobjectModel POM = new PageobjectModel();
	
	
	@Given("User launches the W3school link")
	public void user_launches_the_w3school_link() {
		Driver.get("https://www.w3schools.com/");
//		C.launch("https://www.w3schools.com/");
		
	}

	@Given("User enters OOPS concept in search {string}")
	public void user_enters_oops_concept_in_search(String W3) {
		//WebElement search =Driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		//search.sendKeys(W3,Keys.ENTER);
		POM.getW3search().sendKeys(W3,Keys.ENTER);    
	}

	@When("User clicks the OOPS link")
	public void user_clicks_the_oops_link() {
		Driver.findElement(By.xpath("(//a[@class='gs-title'])[1]")).click();	   
	}

	@When("User click the log in button")
	public void user_click_the_log_in_button() {
		//Driver.findElement(By.xpath("//a[text()='Log in']")).click();

		C.clickElement(POM.getW3Login());
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password(DataTable UPlist) throws AWTException {
		List<String> userpasslist = UPlist.asList();
		String username = userpasslist.get(0);
		String password = userpasslist.get(1);
		Driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		Driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		Driver.findElement(By.xpath("(//button)[2]")).click();    
	}

	@Then("User validates his\\/her name {string}")
	public void user_validates_his_her_name(String name) {
		WebElement hi = Driver.findElement(By.xpath("//h2[1]"));
		String text = hi.getText();
		System.out.println(text);
		
	}


}

