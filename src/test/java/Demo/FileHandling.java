package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FileHandling {
  @Test
  public void f() throws IOException 
  {
	  File src = new File ("C:\\Users\\Training_c2d.02.11\\Documents\\TestData.xlsx");
	  FileInputStream fis =new FileInputStream(src);
	  XSSFWorkbook wb =  new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheet("credentials");
	  int j=0;
	  for (int i=1;i<=sheet1.getLastRowNum();i++)
	  {
		  String uname= sheet1.getRow(i).getCell(j).getStringCellValue();
		  String pwd= sheet1.getRow(i).getCell(j+1).getStringCellValue();
		  System.out.println(uname+"  "+pwd);		  
	  }
	  wb.close();
  }
}
