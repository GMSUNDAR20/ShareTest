package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Login;
import UtilityPackage.BrowserFactory;

public class LoginTestCase {
	WebDriver driver;
	@Test
	public void testlogin()
	{
		driver=BrowserFactory.startbrowser("chrome", "http://demoaut.com");
		Login lin=new Login(driver);
		lin.loginuser("tutorial", "tutorial");
	}

}
