package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelUsingDataFormatter_File {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Neelashree\\Desktop\\FetchingDatafromExcel.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(8);
		
		Cell cell = row.getCell(2);
		
		DataFormatter format = new DataFormatter();
		String ExcelData = format.formatCellValue(cell);
		System.out.println(ExcelData);

	}

}
