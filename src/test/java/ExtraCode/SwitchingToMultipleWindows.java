package ExtraCode;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchingToMultipleWindows {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("//span[text()='AGENT LOGIN']")).click();
        //curent window i.e main window
//		String mainwin=driver.getWindowHandle();
//		//allwins holds multiple tab 
//		Set<String> allwins=driver.getWindowHandles();
//
//		for(String childwin: allwins)
//		{
//			driver.switchTo().window(childwin);
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//span[text()='I Agree']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//span[@class='fare-detail-popup-close-sign fa fa-window-close fa-lg']")).click();
//		}
//		
//		driver.switchTo().window(mainwin);
//		driver.findElement(By.xpath("//a[contains(text(),'Please click here for Empanelment for PAD')]")).click();

       //***************using Iterator********************** 
       
//       String mainwin= driver.getWindowHandle();
//      String maintitle= driver.getTitle();
//       Set<String> allwins=driver.getWindowHandles();
//       
//      Iterator<String> it=allwins.iterator();
//      
//      while(it.hasNext())
//      {
//    	String  childwin=it.next();
//    	if(!maintitle.contains(childwin))
//    	{
//    		driver.switchTo().window(childwin);
//    		Thread.sleep(3000);
//    		driver.findElement(By.xpath("//span[text()='I Agree']")).click();
//    		Thread.sleep(3000);
//			driver.findElement(By.xpath("//span[@class='fare-detail-popup-close-sign fa fa-window-close fa-lg']")).click();
//    	}
//      }
//      driver.switchTo().window(mainwin);
//      driver.findElement(By.xpath("//a[contains(text(),'Please click here for Empanelment for PAD')]")).click();
      
      
}
}
