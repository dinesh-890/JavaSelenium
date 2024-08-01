package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistsDemo {

	public static void main(String[] args) {
		ArrayList Mylist=new ArrayList(); //correct declaration stores heterogenous data
		/*List Mlist=new ArrayList(); //correct declaration stores heterogenous data
		//ArrayList <Integer>Mylist1=new ArrayList<Integer>(); //stores integeres
		//ArrayList <Employee>Mylist2=new ArrayList<Employee>(); //stores employee data*/
		Mylist.add(100);
		Mylist.add("selenium");
		Mylist.add('c');
		Mylist.add(10.5);
		Mylist.add("selenium");
		Mylist.add(null);
		System.out.println("Size of list: "+Mylist.size());  //size of array
		System.out.println("total elements: "+Mylist);
		Mylist.remove(1);  //removing element from index
		System.out.println("After removing Element  from index 1: "+Mylist);
		Mylist.add(3, 'd');  //adding element at particular index
		System.out.println("After adding an extra element "+Mylist);
		System.out.println(Mylist.get(4));   //retrieving value from particular index
		System.out.println(Mylist.lastIndexOf("selenium")); //gives last occurrence of particular object
		System.out.println(Mylist.set(2, "java"));  //replacing element
		System.out.println(Mylist);
		//Using for loop
		System.out.println("using for loop");
		for(int i=0;i<Mylist.size();i++) {
			System.out.println(Mylist.get(i));
		}
		System.out.println("using for each loop");
		//using foreach loop
		for(Object element:Mylist) {  //
			System.out.println(element);
		}
		System.out.println("using iterator");
		//using iterator
		Iterator it=Mylist.iterator();
		//Iterator <Integer> it=Mylist.iterator(); //reads homogenous data
		while(it.hasNext()) {  //will check whether element present or not,only follow element
			System.out.println(it.next());  //gets element from list
		}
		System.out.println("It list empty or not: "+Mylist.isEmpty()); //checking empty or not
		
		ArrayList l2=new ArrayList();  //create new list to add deleted elements
		l2.add(100);
		l2.add("selenium");
		System.out.println(Mylist.removeAll(l2)); //small list created to delete elements
		System.out.println(Mylist);

	}

}
