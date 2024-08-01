package Day21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drivermethods2 {
	static void waitTime(int n) throws InterruptedException {  //method to wait time
		Thread.sleep(n);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.navigate().refresh();
		//String url=driver.getCurrentUrl();  //currenturl
		String title=driver.getTitle();    //title
		System.out.println("Title: "+title);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Dinesh");
		driver.findElement(By.id("email")).sendKeys("Dinesh123@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9387634");
	    waitTime(3000) ; //input[@value='male']
	   WebElement male= driver.findElement(By.xpath("//input[@value='male']"));
	   //System.out.println(male.getText());
	   male.click();
	   System.out.println("Gender selected: "+male.isSelected());
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,500)");
	   driver.findElement(By.xpath("//input[@value='sunday']")).click();
	   driver.findElement(By.xpath("//input[@value='saturday']")).click();
	   String sun=driver.findElement(By.xpath("//label[text()='Sunday']")).getText();
	   String sat=driver.findElement(By.xpath("//label[text()='Saturday']")).getText();
	   System.out.println("Days selected: "+sun+" "+sat);
	   WebElement cnt=driver.findElement(By.xpath("//select[@id='country']"));
	   Select dropdown = new Select(cnt);  //dropdown vaues
	   dropdown.selectByValue("india");
	   waitTime(3000);
	   WebElement colour=driver.findElement(By.xpath("//select[@id='colors']"));
	   Select c = new Select(colour);
	   c.selectByVisibleText("Blue");  //methods in dropdown
	  
	    //driver.close();  //closed first tab or instance of driver
	   // driver.quit();// closed complete browser 
	}
	

}
