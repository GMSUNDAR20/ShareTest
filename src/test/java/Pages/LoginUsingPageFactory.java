package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class LoginUsingPageFactory {
	
	WebDriver driver;
	
	public LoginUsingPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//a[@href='login.htm']")
	WebElement username;
		
	@FindBy(how=How.XPATH, using="//input[@id='userName']")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//input[@name='Login']")
	WebElement signin;
	
	public void login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		signin.click();
		
	}
	

}
