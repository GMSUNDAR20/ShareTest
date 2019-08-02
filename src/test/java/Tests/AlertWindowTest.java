package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AlertWindow;
import UtilityPackage.BrowserFactory;

public class AlertWindowTest {
	
	WebDriver driver;

	@Test
	public void findDetailsTest()
	{
		driver=BrowserFactory.startbrowser("chrome", "http://10.232.237.143:443/TestMeApp");
		AlertWindow obj=PageFactory.initElements(driver, AlertWindow.class);
		obj.FindDetails();
		String alertmessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("alert message is: "+alertmessage);
	}
}
