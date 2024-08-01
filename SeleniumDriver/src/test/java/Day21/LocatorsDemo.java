package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name=\"uid\"]")).sendKeys("87373633"); //using tag and attribute
		//  using and or operator can use locators //input[@name="v1" and @id="v2"]
		//  using contains method---//input[contains(@name,"uid")]
		// using starts with       //input[starts-with(@name='ui')]
		// using xpath axes-   //input[@name='uid']/following::label[1]
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("373738");
		//chained xpath-  //div[@class="logo"]/a/img
		boolean img=driver.findElement(By.xpath("//div[@class=\"logo\"]/a/img")).isDisplayed();
		System.out.println("Image status: "+img);
		String title1=driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
		boolean b=driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).isDisplayed();
		System.out.println("Title bewlow: "+title1);
		System.out.println("Displaying ot not: "+b);
		String s1=driver.findElement(By.xpath("//a[contains(text(),'Security Project')]")).getText();
		System.out.println("Menubar lst itme: "+s1);
		driver.findElement(By.xpath("//a[text()=\"Insurance Project\"]")).click();  //without attribute, using innertext
	}

}
