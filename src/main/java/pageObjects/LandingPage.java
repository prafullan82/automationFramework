package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// By signin = By.cssSelector("a[href*='Sign in']");

	@FindBy(css = "a[href*='sign_in']")
	WebElement signin;

	public WebElement signin() {
		return signin;
	}
	@FindBy(xpath = "//div[@class='text-center']/h2")
	WebElement title;

	public WebElement getTitle() {
		return title;		
	}
}
