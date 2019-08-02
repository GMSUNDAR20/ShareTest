package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Registration {

	WebDriver driver;
	
	public Registration(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//a[@href='RegisterUser.htm']")
	WebElement signup;
	
	
	
}
