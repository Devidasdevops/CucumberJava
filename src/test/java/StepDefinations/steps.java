package StepDefinations;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class steps {
	
	WebDriver driver;
	String demo_url;
	
	MyAccountPage myaccountpg;
	LoginPage lp;
	
	Logger logger;
	
	@Given("User Launch browser")
	public void user_launch_browser() {
	    driver= new ChromeDriver();
	}

	@And("opens URL {string}")
	public void opens_url(String demo_url) {
		driver.get(demo_url);
	}

	@When("User navigate to MyAccount menu")
	public void user_navigate_to_my_account_menu() {
		driver.findElement(By.linkText("My Account")).click();
	}

	@And("click on Login")
	public void click_on_login() {
		driver.findElement(By.linkText("Login"));
	}

	@And("Email {string} and password {string}")
	public void email_and_password(String email, String pwd) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
//		driver.findElement(By.name("email")).sendKeys(email);
//		driver.findElement(By.name("password")).sendKeys(pwd);
		lp = new LoginPage(driver);
		lp.txtUsername(email);
		lp.txtPassword(pwd);
	}

	@And("Click on Login button")
	public void click_on_login_button() {
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		lp = new LoginPage(driver);
		lp.clickLoginbtn();
	}

	@Then("User validates My Account heading")
	public void user_navigates_to_my_account_page() {
		myaccountpg= new MyAccountPage(driver);
		boolean teargetPage=myaccountpg.isMyAccountPageExists();
		
		Assert.assertTrue(teargetPage);
	}
	
	
	@And("User closes browser")
	public void user_closes_browser() {
	    driver.quit();
	}
	
}
