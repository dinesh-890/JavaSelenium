package BasicLearning;

interface Shape{
	int length=15;//default static and final variable
	int width=25;
	void circle();//abstract method
	default void square(){//method must not have implementation
	System.out.println("Square");
	}
	static void rectangle() {
		System.out.println("rectangle");
	}
}
public class InterfacesTest implements Shape
{
	public void circle(){
		System.out.println("Circle");
	}
	public static void main(String[] args) {
		InterfacesTest it=new InterfacesTest();
		it.circle();//calling abstract 
		it.square();//calling default
		
		Shape.rectangle();//static method is in interface
	}

}
