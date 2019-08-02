package Demo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest {
	
	WebDriver driver;
	
  @Test
public void Bus() {
	  WebDriverWait wait=new WebDriverWait(driver,30);
	  String ExpectedResult="Search Bus Tickets";
	  
	  /*(driver.findElement(By.xpath("//input[@tabindex='1']"))).sendKeys("Chennai (All Locations)");
	  (driver.findElement(By.xpath("//input[@tabindex='2']"))).sendKeys("Madurai (All Locations)");
	  (driver.findElement(By.xpath("//input[@tabindex='3']"))).sendKeys("31-Jul-2019");
	  (driver.findElement(By.xpath("//button[@id='search_btn']"))).click(); 
	  wait.until(ExpectedConditions.titleIs("Search Bus Tickets"));
	  Assert.assertEquals(ExpectedResult, driver.getTitle());*/
	  driver.switchTo().frame(3);
	  WebElement we=driver.findElement(By.xpath("//html[@lang='en']/body/div/div[3]"));
	  Actions act=new Actions(driver);
	  act.dragAndDropBy(we, 400, 200);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2d.02.11\\Downloads\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	  
  }

 

}
