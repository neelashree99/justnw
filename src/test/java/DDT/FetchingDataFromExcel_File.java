package DDT;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel_File {

	public static void main(String[] args) throws Throwable {
	
		FileInputStream fis = new FileInputStream("C:\\Users\\Neelashree\\Desktop\\FetchingDatafromExcel.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
	    Cell cell = row.getCell(0);
	    
	    String ExcelData = cell.getStringCellValue();
	    System.out.println(ExcelData);
	}
}
