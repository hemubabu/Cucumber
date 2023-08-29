package com.flipkartshopping;

import java.util.List;
import java.util.Map;
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

public class PhonesStepDefinition extends CommonActions{
	PageobjectModel POM = new PageobjectModel();
	//static WebDriver Driver;
	 public static String mob;
	static String Tv;
	static String phone;
	CommonActions C = new CommonActions();

	
	

	@Given("User quit the buton")
	public void user_quit_the_buton() throws InterruptedException {
		POM.getClose();
		Thread.sleep(3000);
		C.clickElement(POM.getClose()); 
		
		
	}
	@When("User enters the mobile name with one dim list")
	public void user_enters_the_mobile_name_with_one_dim_list(DataTable Moblist) {
		List<String> L =Moblist.asList();
		mob = L.get(1);
	    C.insertText(POM.getSearch(),mob);
	}

	

	@Then("User validates the mobile name")   
	public void user_validates_the_mobile_name() {
		List<WebElement> ip = Driver.findElements(By.xpath("//div[contains(text(),'"+mob+"')]"));
		for(int i=0;i<ip.size();i++) {
			WebElement phone =ip.get(i);
			String phonelist = phone.getText();
			System.out.println(phonelist);
			
		}
		
	    
	}
	@When("User enters the TV names with one dim map")
	public void user_enters_the_TV_names_with_one_dim_map(DataTable Tvmap) {
		Map<String,String> T = Tvmap.asMap(String.class,String.class);
		Tv = T.get("TV1");
		C.insertText(POM.getSearch(),Tv);    
	}
	@Then("User validates the TV name")
	public void user_validates_the_tv_name() {
		List<WebElement> ip = Driver.findElements(By.xpath("//div[contains(text(),'"+Tv+"')]"));
		for(int i=0;i<ip.size();i++) {
			WebElement television =ip.get(i);
			String Tvlist = television.getText();
			System.out.println(Tvlist);
			
		}
		    
	}
	
	
	
	@When("User enters the phone names in Scenario Outline {string}")
	public void user_enters_the_phone_names_in_scenario_outline(String phones) {
		
		phone=phones;
		C.insertText(POM.getSearch(), phone);  
	}
	@Then("User validates the phone name in Scenario Outline")
	public void user_validates_the_phone_name_in_scenario_outline() {
		List<WebElement> ip = Driver.findElements(By.xpath("//div[contains(text(),'"+phone+"')]"));
		for(int i=0;i<ip.size();i++) {
			
			WebElement mobilephone =ip.get(i);
			String phonelist = mobilephone.getText();
			System.out.println(phonelist);
			System.out.println("Scenario Outline Successful");
			
		}
		//Driver.quit();
	    
	}

	
	
	
		


}
