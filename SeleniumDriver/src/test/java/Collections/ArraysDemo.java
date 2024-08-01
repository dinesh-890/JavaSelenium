package Collections;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[]= {29,10,2,5,7,9,29,29};
		int ele=29,c1=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {  //searching ele in array how many times ele repeated
				c1++;
			}
		}
		System.out.println(c1);
		System.out.println(Arrays.toString(a)); //elemenst in set
		Arrays.sort(a);
		System.out.println("Sorting numbers: "+Arrays.toString(a));  //sorting array using method
	   char c[]= {'p','f','h','j'};
	   Arrays.sort(c);
	   System.out.println("Sorting characters: "+Arrays.toString(c));
	   String s[]= {"dinesh","java","selenium","Automation"};
	   Arrays.sort(s);
	   System.out.println("Sorting strings: "+Arrays.toString(s));
	   //reversing array
	   for(int k=a.length-1;k>=0;k--) {
		   
	   }
	   
	
	}

}
