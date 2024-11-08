package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertingDataToExcel {
	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\Neelashree\\Documents\\testdatafromExcel.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.createRow(5);
		Cell cell = row.createCell(8);

		cell.setCellValue("kukum");

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Neelashree\\Documents\\testdatafromExcel.xlsx");
		book.write(fos);
		book.close();
	}
}
