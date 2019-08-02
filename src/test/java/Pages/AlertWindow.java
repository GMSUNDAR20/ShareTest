package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlertWindow {
	
WebDriver driver;
	
	public AlertWindow(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@value='FIND DETAILS']")
	WebElement findDetails;
		
	public void FindDetails()
	{
		findDetails.click();
				
	}

}
