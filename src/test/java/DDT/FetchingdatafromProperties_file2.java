package DDT;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchingdatafromProperties_file2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");

		Properties p = new Properties();
		p.load(fis);
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		String url = p.getProperty("url");

		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
