package Learnings;

import java.io.IOException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		System.out.println("Started");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
		System.out.println(100/n);
		}
		catch(ArithmeticException e) 
		{                            //arithmetic exception
			System.out.println("invalid data entered");
		}
		System.out.println("Execution done");
		int a[]= new int[5];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=2;
		a[4]=22;
		for(int i=0;i<=a.length;i++) { //arrayindexoutofbound as there are only 5 elements
			try {
				System.out.println(a[i]);
				}
				catch(ArrayIndexOutOfBoundsException a1) {   //arrayindexoutofbound as there are only 5 elements
					System.out.println("index not found");
					System.out.println(a1.getMessage());
				}
		}
		String s="selenium";
		try {
		int k=Integer.parseInt(s);
		
		}
		catch(NumberFormatException n1) {  //Numberformat exception
			System.out.println("cannot convert string to number");
		}
		
		
		String s1=null;
		try {
			System.out.println(s1.length());
		}
		 catch(NullPointerException np){
			 System.out.println("cannot find length of string");//nullpointer exception
		 }
	
	}
}
