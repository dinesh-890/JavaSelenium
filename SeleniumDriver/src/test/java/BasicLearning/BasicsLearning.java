package BasicLearning;

import java.util.Scanner;

public class BasicsLearning {
	int empi;
	String name;
	int age;
	String gender;
	
	void display() {
		System.out.println(empi);
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		}

	public static void main(String[] args) {
		BasicsLearning e1=new BasicsLearning();//creating object
		BasicsLearning e2=new BasicsLearning();
		BasicsLearning e3=new BasicsLearning();
		BasicsLearning e4=new BasicsLearning();
		e1.empi=100;//assigning variable to object
		e1.name="Dinesh";
		e1.age=34;
		e1.gender="Male";
		e1.display();//calling object to method
		int arr[]= {2,3,4,5,6,7,6,3,2};
		for(int k=0;k<arr.length;k++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[k]==arr[j]) {
					System.out.println("Duplicate element"+ arr[j]);
				}
			}
			//System.out.println(arr[k]);
			
		}
		
		
		
		
		
		/*Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		//int k=0;
		//REVERSING NUMBER+PALINDROME 
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
		}*/

	}

}
