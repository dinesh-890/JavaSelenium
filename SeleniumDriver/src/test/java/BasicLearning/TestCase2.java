package BasicLearning;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class TestCase2 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k = 1;
		BasicsLearning e1=new BasicsLearning();//creating object
		BasicsLearning e2=new BasicsLearning();
		BasicsLearning e3=new BasicsLearning();
		BasicsLearning e4=new BasicsLearning();
		e1.empi=100;//assigning variable to object
		e1.name="Dinesh";
		e1.age=34;
		e1.gender="Male";
		e1.display();
		/*REVERSING NUMBER+PALINDROME 
		int main_num=n;
		while(n!=0) {
			k=k*10 + n%10;
			n=n/10;
		}
		System.out.println(k);
		if(k==main_num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		PRODUCT OF DIGITS IN NUMBER
		int prod=1;
		while(n!=0) {
			k=n%10;
			prod*=k;
			n=n/10;
		}
		SUM OF DIGITS IN NUMBER
		int sum=0;
		while(n!=0) {
			k=n%10;
			sum+=k;
			n=n/10;
			}
		if(sum%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");}
			//Sum of digits in number
		while(n!=0) {
			n=n/10;
			k++;
		}
		System.out.println(k)
		FIBONACCO
		int n1=0,n2=1;
		for (int i=2;i<10;i++) {
			int c=n1+n2;
			System.out.println(" "+c);
			n1=n2;
			n2=c;
			PRIME NUMBER
		int num=28,c=0;
		for (int i=1;i<=num;i++){
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		FACTORIAL
		for (int i=1;i<=n;i++) {
			k=k*i;
			}
			System.out.println(k);	*/
		
		/* TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equals("Guru99 Bank Home Page")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		driver.findElement(By.id("username")).sendKeys("mngr577976");
		driver.findElement(By.name("password")).sendKeys("amAqAsa");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).click();*/
		
		//String msg=driver.findElement(By.xpath("//*[@id="login_form"]/table/tbody/tr[5]/td[2]/div/b/text()[1]")).getText();
	}
}