package com.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.library.BaseAutoamtion;
import com.library.GenericLib;
import com.pageObjectModel.LoginPage;

public class LoginTeST extends BaseAutoamtion{
	
	@Test
	public void loginToApplication() throws InterruptedException{
		
		LoginPage login=new LoginPage(driver);
		Assert.assertTrue(login.abofEmailAddressTextBox.isDisplayed(), "The ABOF email textbox is not displayed");
		NXGReports.addStep("The abof email textbox is displayed", LogAs.PASSED, null);
		login.abofEmailAddressTextBox.sendKeys(GenericLib.getExcelData("LoginPage",1,0));
		GenericLib.handlekeypad();
		login.abofPasswordTextBox.sendKeys(GenericLib.getExcelData("LoginPage",1,1));
		GenericLib.handlekeypad();
		login.abofSignButton.click();
		Thread.sleep(4000);
		
		
	}

}
