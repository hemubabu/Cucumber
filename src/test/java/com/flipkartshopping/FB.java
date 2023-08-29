package com.flipkartshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.CommonActions;
import com.objectrepository.PageobjectModel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FB extends CommonActions {
	PageobjectModel POM = new PageobjectModel();
	@Given("User launches the facebook application {string}")
	public void user_launches_the_facebook_application(String url) throws Exception {
		
		System.out.println("Launched");
	}

	@Given("User creates the Account")
	public void user_creates_the_account() throws Exception {
		Thread.sleep(3000);
		POM.getCreate();
		
	}
	@When("User fills the Firstname {string}")
	public void user_fills_the_firstname(String fname) {
		WebElement firstname = Driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys(fname);
	    
	}

	@When("User fills the Surname {string}")
	public void user_fills_the_surname(String lname) {
		WebElement lastname = Driver.findElement(By.name("lastname"));
		lastname.sendKeys(lname);
	   
	}

	@When("User fills the Number {string}")
	public void user_fills_the_number(String num) {
		WebElement number=Driver.findElement(By.name("reg_email__"));
		number.sendKeys(num);
		WebElement year = Driver.findElement(By.xpath("//select[@id='year']"));
		Select Y = new Select(year);
		Y.selectByValue("1998");
		WebElement gender = Driver.findElement(By.xpath("//span[@data-type='radio']/span/following-sibling::span/label"));
		gender.click();
	}

	@When("User fills the Password {string}")
	public void user_fills_the_password(String Password) {
		WebElement password = Driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys(Password);
	}

	@When("User fills the Date {string}")
	public void user_fills_the_date(String Date) {
		WebElement date = Driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select D = new Select(date);
		D.selectByValue(Date);  
	}

	@When("User fills the Month {string}")
	public void user_fills_the_month(String Month) {
	    WebElement month = Driver.findElement(By.xpath("//select[@id='month']"));
		Select M = new Select(month);
		M.selectByValue(Month);
	}

	@When("User fills the Year {string}")
	public void user_fills_the_year(String Year) {
		WebElement year = Driver.findElement(By.xpath("//select[@id='year']"));
		Select Y = new Select(year);
		Y.selectByValue(Year);
	}
	@When("User Selects the Gender")
	public void user_selects_the_gender() {
		WebElement gender = Driver.findElement(By.xpath("//span[@data-type='radio']/span/following-sibling::span/label"));
		gender.click();
	}

	@Then("User creates the Facebook accounts")
	public void user_creates_the_facebook_accounts() {
	    System.out.println("Script Executed");
	}


}
