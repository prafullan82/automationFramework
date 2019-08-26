package mycompany.E2EFramework;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
//@Listeners(mycompany.E2EFramework.Listners.class)

public class HomePageTest extends base {
	
	
	
	@BeforeTest
	public void init() throws IOException
	{
		driver = initializeDriver();
		System.out.println(ut.getProperty("url"));
		driver.get(ut.getProperty("url").toString());
		Log.info("Logging started ****************");

		
	}
	
	@Test(dataProvider="getData")
	public void validateSignin(String id, String pwd) 
	{
		
		
		LandingPage lp = new LandingPage(driver);
		
		lp.signin().click();
		
		LoginPage lPage = new LoginPage(driver);
		
		lPage.getUserId().sendKeys(id);
		lPage.getPass().sendKeys(pwd);
		lPage.getLoginButton().click();
		Log.info("Logging started ****************");
		
		lPage.getLogo().click();
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
		//driver = null;
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] obj = new Object[2][2];
		obj[0][0]="firstid@qaclickacademy.com";
		obj[0][1]="firstpassword";
		
		obj[1][0]="secondid@qaclickacademy.com";
		obj[1][1]="secondpassword";
		
		return obj;
	}
	

}
