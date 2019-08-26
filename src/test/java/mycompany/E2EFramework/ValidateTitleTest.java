package mycompany.E2EFramework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

//@Listeners(mycompany.E2EFramework.Listners.class)


public class ValidateTitleTest extends base{
	
	@BeforeTest
	public void init() throws IOException
	{
		driver = initializeDriver();
		System.out.println(ut.getProperty("url"));
		driver.get(ut.getProperty("url").toString());
		Log.info("Logging started ****************");

		
	}
	@Test
	public void validatePageTitle() throws IOException
	{
			
		LandingPage lp = new LandingPage(driver);
		
		AssertJUnit.assertEquals(lp.getTitle().getText(),"Featured Courses");
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		driver = null;
		
	}

}
