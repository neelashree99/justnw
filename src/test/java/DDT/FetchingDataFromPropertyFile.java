package DDT;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//just give . then copy loc from \src
		//calling from project
		//FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\fetchdata.properties.txt");
		//calling from desktop copy from folder "copy as path"
		FileInputStream fis=new FileInputStream("C:\\Users\\Neelashree\\Desktop\\fetchdata.properties.txt");
		Properties p=new Properties();//create class
		//step2:-Create an object to properties class to load all the keys
		p.load(fis);
		//step:3
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		driver.get(URL);

		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
