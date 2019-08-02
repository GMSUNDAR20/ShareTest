package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.LoginUsingPageFactory;
import UtilityPackage.BrowserFactory;

public class LoginUsingPageFactoryTest {

	WebDriver driver;
	@Test
	public void testlogin()
	{
		driver=BrowserFactory.startbrowser("chrome", "http://10.232.237.143:443/TestMeApp");
		LoginUsingPageFactory lin=PageFactory.initElements(driver, LoginUsingPageFactory.class);
		lin.login("tutorial", "tutorial");
	}

}
