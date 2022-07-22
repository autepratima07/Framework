package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	
	public static ExtentReports getreports() {
	
	String path="C:\\Users\\Admin\\eclipse-workspace\\Framework\\Reoprts\\index.html";
	
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("Automation Test Report");
	reporter.config().setReportName("Automation_Test");
	reporter.config().setTheme(Theme.DARK);
	
	
    extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Project Name", "Framework");
	extent.setSystemInfo("Tool", "selenium webdriver");
	extent.setSystemInfo("QA", "Pratima");
	return extent;
	
	
	}
}
