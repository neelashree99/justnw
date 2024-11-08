package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.mysql.cj.jdbc.Driver;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\Neelashree\\Documents\\testdatafromExcel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet2");
		int lrowNum = sheet.getLastRowNum();
		System.out.println(lrowNum);
		for(int i=0;i<lrowNum;i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				Cell cell = row.getCell(j);
				String link = cell.getStringCellValue();
				System.out.println(link);

				DataFormatter df=new DataFormatter();
				//
				String data = df.formatCellValue(cell);
				System.out.println(data);
			}
		}
	}
}
