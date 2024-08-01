package BasicLearning;

public class MethodsTest {
	void method1()//no parameters no return value
	{
		System.out.println("executed m1 without parameters and return values");
	}
	int method2()//no parameters with return value
	{
		return 5;
	}
	void method3(int age) //with  parameters no return value
	{
		System.out.println(age);
	}
	int method4(int a) //with  parameters with return value
	{
		return a+54;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsTest obj1=new MethodsTest();
		obj1.method1();
		int a=obj1.method2();//methods return something need to store in variable
		System.out.println(a);
		obj1.method3(25);
		System.out.println(obj1.method4(54));
		
	}	
}
