package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// By signin = By.cssSelector("a[href*='Sign in']");

	@FindBy(id = "user_email")
	WebElement userid;

	public WebElement getUserId() {
		return userid;
	}
	@FindBy(id = "user_password")
	WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	@FindBy(css = "input[value='Log In']")
	WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	@FindBy(xpath = "//img[@alt='QaClickAcademy']")
	WebElement logo;

	public WebElement getLogo() {
		return logo;
	}
	
	
}
