package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void loginuser(String uname,String pwd)
	{
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

}
