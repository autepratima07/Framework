package Com.PageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
@FindBy(how=How.XPATH,using="//input[@id='email']")
 private WebElement email_txt;
@FindBy(how=How.XPATH,using="//input[@id='pass']")
private WebElement pass;

public WebElement getemail_txt() {
	return email_txt;
 }
public WebElement getpass() {
	return pass;
}

}
	

