package mycompany.E2EFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import org.apache.commons.io.FileUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Utilities {
	
	String propFilePath = "C:\\Users\\rohit.chavan\\workspace\\E2EFramework\\data.properties";
	FileInputStream file = null;
	
	public String getProperty(String property) throws IOException
	{
		FileInputStream file = new FileInputStream(propFilePath);
		
		Properties pr = new Properties();
		pr.load(file);
		
		return pr.getProperty(property);
		
	}
	
	public void getScreenShots(String result) throws IOException
	{
		System.out.println(result+ "  Capturing failed screen");
		File src = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C://Users//rohit.chavan//workspace//E2EFramework//test//"+result+"_screen.png"));		
		
	}

	
	

}
