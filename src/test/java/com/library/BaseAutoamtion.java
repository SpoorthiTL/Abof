package com.library;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;

public class BaseAutoamtion {
	
	public DesiredCapabilities Capabilities;
	public static  AndroidDriver driver;
	public static String SDirpath=System.getProperty("user.dir");
	public static String apkpath=SDirpath+"\\APKFILE\\Abof.apk";
	
	
	@BeforeMethod
	public void setup() throws MalformedURLException{
		
		Capabilities=new DesiredCapabilities();
		Capabilities.setCapability("automationName",GenericLib.getproperties("AUTOMATIONNAME"));
		Capabilities.setCapability("platformName",GenericLib.getproperties("PLATFOMRNAME"));
		Capabilities.setCapability("deviceName",GenericLib.getproperties("DEVICENAME"));
		Capabilities.setCapability("platformVersion", GenericLib.getproperties("PLTFORMVERSION"));
		Capabilities.setCapability("app",apkpath);
		Capabilities.setCapability("appPackage",GenericLib.getproperties("APPPACKAGE"));
		 Capabilities.setCapability("appActivity",GenericLib.getproperties("APPACTIVITY"));
		driver=new AndroidDriver(new URL(GenericLib.getproperties("URL")), Capabilities);
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
