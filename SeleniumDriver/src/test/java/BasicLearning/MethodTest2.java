package BasicLearning;

public class MethodTest2 {
	int n;
	String nam;
	void method1(int age,String name) {
		n=age;
		nam=name;
		System.out.println(n+" "+nam);
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest2 st1=new MethodTest2();
		st1.method1(25,"Dinesh");//passing values into methods
}

}
