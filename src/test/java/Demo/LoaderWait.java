package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoaderWait {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
	  WebDriverWait wait = new WebDriverWait(driver,5);
	  Actions act = new Actions(driver);
	  //By we = By.xpath("//div[@class='contentWrapper']");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='contentWrapper']")));
  
  }
}
