package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet s1=new HashSet();
		//Set s2=new HashSet();
		//HashSet <String>str=new HashSet<String>();
		s1.add(100);
		s1.add(100); //duplicate not allowed
		s1.add("Java");
		s1.add(true);
		s1.add('d');
		System.out.println(s1);  //insertion order not preserved
	   System.out.println(s1.remove("Java"));  //specify value to delete
	   System.out.println(s1.add("Selenium"));  // adding element at end
	   System.out.println(s1); 
	   ArrayList l1=new ArrayList(s1);  //convert hashset to arraylist
	   System.out.println("element at index 2: "+l1.get(2));
	   for(Object s:l1) {  //using for each loop can read data from hashset
		   System.out.println(s);
		   
	   }
	   System.out.println("using iterator");
	   Iterator i=l1.iterator();  //using iterator
	   while(i.hasNext()) {
		   System.out.println(i.next());
	   }
	   s1.clear();  //clears all elements
	   System.out.println(s1);
	   
	
	
	}
	
	

}
