package com.LoginTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;


public class Test_001 extends BaseClass {
	
	@Test
	public void verifyloginpage() {
	//Identifying web elements
	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
   
	Library.custom_sendkeys(login.getemail_txt(),excel.getSheetData("Sheet1", 0, 0), "Email");
	Library.custom_sendkeys(login.getpass(),excel.getSheetData("Sheet1", 0, 1), "password");
	
	}
	
	

}
