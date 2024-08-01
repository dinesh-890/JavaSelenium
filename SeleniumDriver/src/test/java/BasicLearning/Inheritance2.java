package BasicLearning;

class A1{   
	int x =100;
	void display() {
		System.out.println(x);
		System.out.println("Class A1");
	}
}
class B1 extends A1{  //single inheritance
	int y=28;
	void show() {
		System.out.println(y);
		System.out.println("Class B1");
	}
}
class C1 extends A1{  //hierrachy inheritance
	int z=28;
	void print() {
		System.out.println(z);
		System.out.println("Class C1");
	}
}

public class Inheritance2 {
      public static void main(String[] args) {
		B1 obj1=new B1();
		obj1.show();
		obj1.display();
		C1 obj2=new C1();
		obj2.display();
		obj2.print();

	}

}
