package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	
	public AndroidDriver driver;
	
	public LoginPage(AndroidDriver idriver){
		this.driver=idriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="com.abof.android:id/login_email_edt")
	public WebElement abofEmailAddressTextBox;
	
	@FindBy(id="com.abof.android:id/autoFillEmail")
	public WebElement abofAtuoFillIcon;
	
	@FindBy(id="com.abof.android:id/login_password_edt_edt")
	public WebElement abofPasswordTextBox;
	
	@FindBy(id="com.abof.android:id/txtVisiblePwd")
	public WebElement abofShowIcon;
	
	@FindBy(id="com.abof.android:id/abof_login_btn")
	public WebElement abofSignButton;

}
