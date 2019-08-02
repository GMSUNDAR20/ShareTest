package Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import UtilityPackage.BrowserFactory;

public class FileUpload {
  WebDriver driver;
	@Test
  public void fileuplod() throws AWTException {
	driver=BrowserFactory.startbrowser("chrome", "C:\\Users\\Training_c2d.02.11\\Documents\\FileUpload.html");
	driver.findElement(By.xpath("//input[@name='fileupload']")).click();
	Robot robot=new Robot();
	robot.setAutoDelay(1000);
	String path="C:\\Users\\Training_c2d.02.11\\Documents\\cs4.txt";
	StringSelection sel=new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.setAutoDelay(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}
  
}
