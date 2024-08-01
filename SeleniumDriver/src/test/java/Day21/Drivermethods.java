package Day21;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Drivermethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		String url=driver.getCurrentUrl();  //currenturl
		String title=driver.getTitle();    //title
		boolean b1=driver.findElement(By.xpath("//button[text()='Search']")).isDisplayed(); //check element display or not
		System.out.println("Display status: "+b1);
		WebElement b2=driver.findElement(By.xpath("//label[text()='Person With Disability Concession']"));
		System.out.println("Enable status: "+b2.isEnabled());  //checks enable or not
		b2.click();
		Thread.sleep(2000);
		System.out.println(b2.isSelected());
		driver.findElement(By.xpath("//span[text()='OK']")).click();
		Thread.sleep(3000);
		System.out.println("URL: "+url);
		System.out.println("Title: "+title);
		String window1=driver.getWindowHandle();
		System.out.println("Window id 1: "+window1);
		driver.findElement(By.xpath("//a[text()='Please click here for Empanelment for PAD items for Catering.']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator it=windows.iterator();
		while(it.hasNext()) {
			System.out.println("all windows: "+it.next());
		}
		

	}

}
