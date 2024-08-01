package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		//Map h2=new Map();
		HashMap <Integer, String>h1=new HashMap<Integer, String>(); //specify type of values and declaration
      h1.put(11, "Java");  //adding element
      h1.put(12, "Dinesh");
      h1.put(13, "Selenium");
      h1.put(14, "Dinesh");
      h1.put(11, "Automation"); //replaced value with old value
      System.out.println(h1);
      System.out.println("size of map:"+h1.size());
      h1.remove(12);
      System.out.println("size of map after removing:"+h1.size());
      System.out.println(h1.get(14));  //retrieves value from particular key
      System.out.println(h1.keySet()); //gets all keys from hashmap
      System.out.println(h1.values());  //gets all values from hashmap
	  System.out.println(h1.entrySet());  //gets all keys and values in set
	  System.out.println("using for each loop:");
	  for(int k:h1.keySet()) {
		  System.out.println(k+" "+h1.get(k));  //reading data
	}
	  System.out.println("using iterator");
	  Iterator <Entry <Integer, String>>  it=h1.entrySet().iterator();  //using iteraot
	   while (it.hasNext()){
		   //System.out.println(it.next()); 
		   Entry en=it.next();
		   System.out.println(en.getKey()+" "+en.getValue());
		   
	   }
	   //h1.clear()//clears all elements from hashmap
	  
	
	
	}

}
