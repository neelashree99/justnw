package ExtraCode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PP {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	FileInputStream fis=new FileInputStream("C:\\Users\\Neelashree\\git\\repository\\Advanced_Selenium\\src\\test\\resources\\delete.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sheet=book.getSheet("Sheet1");
	
	Row row1=sheet.createRow(5);
	Cell cell1=row1.createCell(4);
	cell1.setCellValue("kavya");
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Neelashree\\git\\repository\\Advanced_Selenium\\src\\test\\resources\\delete.xlsx");
	
	book.write(fos);
	
	
	
}
}
