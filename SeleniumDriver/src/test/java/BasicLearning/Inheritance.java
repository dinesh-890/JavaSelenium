package BasicLearning;
class A{   
	int a =100;
	void display() {
		System.out.println(a);
		System.out.println("Class A");
	}
}
class B extends A{  //single inheritance
	int b=28;
	void show() {
		System.out.println(b);
		System.out.println("Class B");
	}
}
class C extends B{  //multilevel inheritance
	int c=89;
	void print() {
		System.out.println(c);
		System.out.println("Class C");
		
	}
}

public class Inheritance {

	public static void main(String[] args) {
		//B b1=new B();
		C c1=new C();
		c1.display();
		c1.show();
		c1.print();

	}

}
