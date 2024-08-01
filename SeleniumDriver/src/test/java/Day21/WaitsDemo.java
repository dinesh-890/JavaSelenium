package Day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicitly wayit
		
		//driver.navigate().refresh();
		//String url=driver.getCurrentUrl();  //currenturl
		String title=driver.getTitle();    //title
		System.out.println("Title: "+title);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Dinesh");
		driver.findElement(By.id("email")).sendKeys("Dinesh123@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9387634");
	     //input[@value='male']
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
	   WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(6)); //explicit wait
	   WebElement c1=wb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='country']"))); //waits until particular webelement is visible 
	   
	   //WebElement cnt=driver.findElement(By.xpath("//select[@id='country']"));
	   Select dropdown = new Select(c1);  //dropdown values
	   dropdown.selectByValue("india");
	   WebElement colour=driver.findElement(By.xpath("//select[@id='colors']"));
	   Select c = new Select(colour);
	   c.selectByVisibleText("Blue");  //methods in dropdown
	  
	    //driver.close();  //closed first tab or instance of driver
	   // driver.quit();// closed complete browser

	}

}
