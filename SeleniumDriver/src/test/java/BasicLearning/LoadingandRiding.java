package BasicLearning;
class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
	
}
class XYZ extends ABC{
	void m1(int a) {  //method overriding
		System.out.println(++a);
	}
	void m2(int b) {//method over loading
		System.out.println(b*b);
	}
	void m2(int c ,int d) {
		System.out.println(c*d);
	}
	
}

public class LoadingandRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    XYZ x1=new XYZ();
    x1.m1(4);
    x1.m2(7);
    x1.m2(4,6);
	}

}
