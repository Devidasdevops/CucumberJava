package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "email")
	WebElement locEmail;
	
	@FindBy(name = "password")
	WebElement locPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;

	public void txtUsername(String email)
	{
		locEmail.sendKeys(email);
	}
	
	public void txtPassword(String pwd)
	{
		locPassword.sendKeys(pwd);
	}
	
	public void clickLoginbtn()
	{
		btnLogin.click();
	}
}
