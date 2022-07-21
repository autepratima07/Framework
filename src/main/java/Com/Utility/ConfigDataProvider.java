package Com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	public static Properties pro;
	
	public ConfigDataProvider() throws Exception  {
	String path="C:/Users/Admin/eclipse-workspace/Framework/Config/Config.Properties";
	
	FileInputStream fis=new FileInputStream(path);
	Properties pro=new Properties();
	pro.load(fis);
	}
	
	public String getBaseUrl() {
		return pro.getProperty("Base_Url_QA1");
	}
	
	
	
	
	
}
