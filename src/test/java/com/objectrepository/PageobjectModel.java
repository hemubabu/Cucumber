package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.CommonActions;
import com.flipkartshopping.PhonesStepDefinition;

public class PageobjectModel extends CommonActions{
	
	public PageobjectModel() {
		PageFactory.initElements(Driver, this);// this method is used to overcome the stale element exception.Because,(driver,this)is used to integrate with findby 
		// and refreshes the dom structure alltime.	
		}
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close;
	
	public WebElement getClose() {
		return close;
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement create;
	
	public WebElement getCreate() {
		return create;
	}
	
	
	@FindBy(name="q")
	private WebElement search;
	
	
	 
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement W3search;
	
	

	public WebElement getW3search() {
		return W3search;
	}
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement W3login;

	public WebElement getW3Login() {
		return W3login;
	}
	
	
	
	
	
	
	
	

}
