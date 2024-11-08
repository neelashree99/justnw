package ExtraCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Launch_Inincognito {
	//use ChromeOptions class create object
	//then add "incognito" as an argumment to the .addArgumentes method of ChromeOptions class.
	//then pass ChromeOptions class reference to driver.
	public static void main(String[] args) {
		
		WebDriver driver;
		ChromeOptions option=new ChromeOptions();
		option.addArguments("incognito");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		}
}
