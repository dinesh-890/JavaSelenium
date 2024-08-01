package Day21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
		driver.get("https://www.demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		String title=driver.getTitle(); //stores title of webpage
		System.out.println("Title: "+title);
		if(title.equals("Guru99 Bank Home Page")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		List<WebElement> menulist=driver.findElements(By.className("dropdown")); //group of elements
		System.out.println("size of list:"+menulist.size()); //number of eleemmts in list
		List<WebElement> tags=driver.findElements(By.tagName("a")); // all tags with a in link
		System.out.println("all tags: "+tags.size());
		List<WebElement> images=driver.findElements(By.tagName("img")); // all images with a in link
		System.out.println("all images: "+images.size());
		driver.findElement(By.name("uid")).sendKeys("mngr577976"); //sends value in textbox
		driver.findElement(By.name("password")).sendKeys("amAqAsa");
		boolean bt=driver.findElement(By.name("btnLogin")).isDisplayed();//check element displayed or not
		System.out.println("button display "+bt);
		driver.findElement(By.name("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String alertmsg=driver.switchTo().alert().getText(); //navigate to alert message
		System.out.println("Alert message is: "+alertmsg);
		driver.switchTo().alert().accept(); //accepts alert message
		//driver.findElement(By.partialLinkText("Insurance")).click();  partial linktext
		driver.findElement(By.linkText("Insurance Project")).click();
		
		
		//System.out.println("Current URL: "+driver.getCurrentUrl()); //gives current URL
		//System.out.println(driver.getPageSource());
		
		/*sign up page
		driver.findElement(By.partialLinkText("Welcome To Manager's Page of Guru99 Bank")).isDisplayed();
		//System.out.println("mesage "+msg);
		/*String alertmsg=driver.switchTo().alert().getText();
		System.out.println("Alert message is:"+alertmsg);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div[4]/ol/li[1]/a")).click();
	driver.findElement(By.name("emailid")).sendKeys("chigullapallydinesh@gmail.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("btnLogin")).click();*/
		//userid-mngr577976,amAqAsa
		//driver.close();
	}

}
