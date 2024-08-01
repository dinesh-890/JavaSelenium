package Learnings;
class Parent{
	String s="selenium";
	void m1() {
		System.out.println("executes parent");
	}
	
}
class Child extends Parent{
	int i=100;
	void m2() {
		System.out.println("executes child class");
	}
}

public class TypeCastingObj {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.s);
		c.m1();
		System.out.println(c.i);
		c.m2();
		System.out.println("breaking execution");
		Parent p=new Child();  //parent ref hold child variable
		System.out.println(p.s);
		p.m1();
		//System.out.println(p.i); //cannot access child class using parent ref variable
		//p.m2();
		Parent p1=new Parent();
		Child c1=(Child) p1;  //downcasting from parent to child
		System.out.println(c1.i); //can be accessed
		c1.m2();
		

	}

}
