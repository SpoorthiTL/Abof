package com.library;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSample {
	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("Appium server programtilly");
	}
	
	@BeforeClass
	public void beforeclass(){
		System.out.println("beforeclass is exceuted");
	}
	
	@BeforeTest
	public void Test(){
		System.out.println("Launching the application");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("set the ip address");
	}

	
	@Test(priority=1,enabled=true)
	public void sampletest(){
		System.out.println("Login to the application");
	}
	
	@Test(priority=2,enabled=true)
	public void a(){
		System.out.println("verify the home page");
	}
}
