package com.flipkartshopping;

import com.baseclass.CommonActions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	CommonActions C = new CommonActions();
	static long StartTime;
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");
		C.launch("https://www.facebook.com/");
		StartTime = System.currentTimeMillis();
		
	}
	@After
	public void afterScenario() {
		System.out.println("After Scenario");
		C.quitBrowser();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - StartTime);
	}
	

}
