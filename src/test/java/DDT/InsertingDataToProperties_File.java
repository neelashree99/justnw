package DDT;

import java.io.FileOutputStream;
import java.util.Properties;

public class InsertingDataToProperties_File {

	public static void main(String[] args) throws Throwable {

		Properties p = new Properties();
		p.setProperty("username", "standard_user");
		p.setProperty("password", "secret_sauce");
		p.setProperty("url", "https://www.saucedemo.com/");
		//take project loc i.e src\test\resources and add file name
		FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\CommonData.properties");
		//storing in one file and naming the file
		p.store(fos, "commonData");
		System.out.println("data written successfully");
	}
}
