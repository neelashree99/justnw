package DDT;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.util.LinkedHashMap;

import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class InsertDataToExcelUsingMap {
	public static void main(String[] args) throws Throwable {

		FileInputStream fis=new FileInputStream("C:\\Users\\Neelashree\\Desktop\\FetchingDatafromExcel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet2");

		LinkedHashMap<String,String>map=new LinkedHashMap<String,String>();
		map.put("10", "hyb");
		map.put("20", "bang");
		map.put("30", "goa");
		map.put("40","pune");

		int rowNo=0;
		for(Entry<String, String> m : map.entrySet())
		{         //10,pune
			Row row = sheet.createRow(rowNo++);
			row.createCell(0).setCellValue((String)m.getKey());//10
			row.createCell(1).setCellValue((String)m.getValue());//pune
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Neelashree\\Desktop\\FetchingDatafromExcel.xlsx");
		book.write(fos);
		book.close();
	
	
//	LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
//	map.put(19, "sbbs");
//	map.put(382, "sms");
//	map.put(37, "snns");
//	map.put(37, "deepak");
}
}
