package Learnings;
class Animal{
	
}
class Dog extends  Animal{
	
}
class Cat extends Animal{
	
}

public class CastingObj {

	public static void main(String[] args) {
		//Animal an=new Dog(); //child class storing in parent
		//Cat c=(Cat) an;  // casting from parent to child or viceversa as per rule-1
		                 //after converting checking assignment is proper as per rule-2
		//Cat c=(Dog) an;  //invalid as cat and dog don't have relation
		//Animal al=new Dog();
		//Dog dg=(Dog) an;  //valid and all rules are saisfied
		Object o=new String("Selenium");
		String sb=(String) o; // rule-3 not proper
		System.out.println(o);
		
		
		

	}

}
