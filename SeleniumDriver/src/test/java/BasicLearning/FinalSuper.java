package BasicLearning;
/*class Test{
	final int x=100;
}
final class Testing{
	final void med() {
		System.out.println("method from testing class");
	}
}
class Testing2 extends Testing{//Testing class is declred as final
	void med() {  //final method cannot be overide
		System.out.println("method from Testing2 class");
	}
}*/
class Animal{
	String colour="white";	
	void display() {
		System.out.println("displaying parent class");
	}
}
class Dog extends Animal{
	String colour="Black";
	void print() {
		System.out.println(super.colour); //super invokes parent class variable
	}
	void display() {
		System.out.println("displaying child class");//overriding
		super.display();
	}
}
public class FinalSuper {

	public static void main(String[] args) {
		Dog d=new Dog();
		//Animal a=new Animal();
		d.print();
		d.display();
		
		/*Test t=new Test();
		t.x=21;  //final varibale value cannot be changed
		System.out.println(t.x);*/

	}

}
