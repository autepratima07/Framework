package Com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;

	public  static void custom_sendkeys(WebElement element,String text,String fieldname) {
	try
	{element.sendKeys(text);
	test.log(Status.PASS, "value successfully send="+text);
	}
	catch(Exception e) {
		test.log(Status.FAIL, e.getMessage());
		System.out.println();
		
	}
	

}
}