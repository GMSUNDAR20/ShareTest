package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelInput {
  @Test
  public void f() throws IOException, Exception
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  File src = new File ("C:\\Users\\Training_c2d.02.11\\Documents\\TestData.xlsx");
	  FileInputStream fis =new FileInputStream(src);
	  XSSFWorkbook wb =  new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheet("credentials");
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	  WebElement uname=driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
	  uname.sendKeys(sheet1.getRow(1).getCell(0).getStringCellValue());
	  pwd.sendKeys(sheet1.getRow(1).getCell(1).getStringCellValue());
	  sheet1.getRow(1).createCell(2).setCellValue("Passed");
	  FileOutputStream fos =new FileOutputStream(src);
	  wb.write(fos);
	  wb.close();
  }
}
