package Com.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static  ExcelDataProvider excel;
	
	@BeforeSuite
	public void StartSetUp() throws Exception {
		 config=new ConfigDataProvider();
		 excel=new ExcelDataProvider();
	} 
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setup(String BrowserName ) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 }
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		
	driver.get(config.getBaseUrl());
	driver.manage().window().maximize();
	}
	
	
	
	
	
	
	
	
@AfterMethod

public void teardown() {
	driver.close();
}
		
	

}
