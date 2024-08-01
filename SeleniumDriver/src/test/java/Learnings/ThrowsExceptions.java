package Learnings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("started excpeiton");
		FileInputStream f1=new FileInputStream("C:\\Users\\CHDINESH\\Desktop\\files\\file1\\46120718.pdf");
		Thread.sleep(3000);
		/*try {
		Thread.sleep(3000);
		}
		catch(InterruptedException e) {
		System.out.println(e.getMessage());
		System.out.println("completed");*/
		}

	}


