package DDT;

import java.io.File;


import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;




public class FetchDatafRomJasonFile {
	public static void main(String[] args) throws Throwable {
		
//		File file = new File("C:\\Users\\Neelashree\\Desktop\\AS-external files\\jason.json");
//		ObjectMapper jsonData = new ObjectMapper(); 
//		JsonNode data = jsonData.readTree(file); 
//		
//		String URL= data.get("url").asText();
//		WebDriver driver=new ChromeDriver();
//		driver.get(URL);
		
		File file=new File("./src\\test\\resources\\jason.json");
		ObjectMapper jsonData = new ObjectMapper();
		JsonNode data = jsonData.readTree(file);
		
		String URL = data.get("url").asText();
		
	ChromeDriver driver=new ChromeDriver();
	driver.get(URL);
	}

}
