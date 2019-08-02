package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicElements {
  @Test
  public void function() 
  {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.google.com");
  WebDriverWait wait = new WebDriverWait(driver,40);
  Actions act = new Actions(driver);
  /*act.moveToElement(driver.findElement(By.xpath("//li[@class='topmenu'][3]"))).click().build().perform();
  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"))));
  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"))).click().build().perform();
  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"))));
  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"))).click().build().perform();*/
  
  WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
  act.keyDown(search,Keys.SHIFT).perform();
  act.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g");
  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))));
  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
  }
}
