package Day21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		//driver.get("https://testautomationpractice.blogspot.com/"); accepts url as string
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.navigate().to("https://www.irctc.co.in/nget/train-search"); //accept URL as object-URL link=new URL("httsp;ss");
		driver.manage().window().maximize();
		System.out.println("Current URl:"+driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@label='Find Trains Disha']")).click();
		Set <String> windowIDs=driver.getWindowHandles(); 
		List <String> windowlist=new ArrayList(windowIDs); 
		
		String parent=windowlist.get(0);
		String child=windowlist.get(1);
	    driver.switchTo().window(child); //switching windows
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bookings");
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[contains(@class,'ui-autocomplete ui-widget')]/input[@aria-controls='pr_id_1_list']")).sendKeys("Hyerabad");
	   driver.findElement(By.xpath("//label[contains(text(),'Railway Pass Concession')]")).click();
	   Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='OK']")).click();
		 driver.findElement(By.xpath("//label[@class='search_btn' and text()='PNR STATUS']")).click();
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		//String child2=windowlist.get(2);
		driver.switchTo().window(child);
		// driver.findElement(By.id("inputPnrNo")).sendKeys("98474444");
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,500)");*/
	  
	}

}
