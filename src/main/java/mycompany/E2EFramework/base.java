package mycompany.E2EFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public static WebDriver driver;
	public Utilities ut = new Utilities(); 
	public static Logger Log = LogManager.getLogger(base.class.getName());//

	public WebDriver initializeDriver() throws IOException
	{
		Utilities ut = new Utilities(); 
		
		if (ut.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			Log.info("Chrome browser launched **********************");
			
		}
		else if (ut.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		Log.info("Chrome browser maximize **********************");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
}
