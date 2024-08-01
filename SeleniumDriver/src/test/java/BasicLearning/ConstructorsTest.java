package BasicLearning;

public class ConstructorsTest {
	int num;
	String nam;
	ConstructorsTest(int age,String name)//parameterized 
	{
		num=age;
		nam=name;
		System.out.println(num+" "+nam);
	}
	ConstructorsTest()//default
	{
		num=60;
		nam="John";
		System.out.println("Executes param cont");
	}
	public static void main(String[] args) {
			ConstructorsTest c1=new ConstructorsTest();//invoke default constructor
			ConstructorsTest c2=new ConstructorsTest(25,"Dinesh");//paratemeterized constructor
	}

}
