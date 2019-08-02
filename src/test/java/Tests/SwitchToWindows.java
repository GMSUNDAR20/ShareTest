package Tests;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import UtilityPackage.BrowserFactory;

public class SwitchToWindows {
	
	WebDriver driver;
  @Test
  public void f() {
	driver=BrowserFactory.startbrowser("chrome", "http://10.232.237.143:443/TestMeApp");
  //driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span")).click();
  WebDriverWait wait=new WebDriverWait(driver,30);
  Actions act=new Actions(driver);
  
	Set<String> set=driver.getWindowHandles();
  for(String s:set)
  {
	  driver.switchTo().window(s);
  }
  driver.switchTo().frame("main_page");
  String phoneno=driver.findElement(By.xpath("//address[@id='demo3']/b/p[4]")).getText();
  System.out.println(phoneno);
  
  }
  
}
