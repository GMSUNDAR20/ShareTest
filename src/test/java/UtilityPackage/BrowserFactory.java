package UtilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver startbrowser(String browsername,String url)
	{
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "‪C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		return driver;
	}

	}
