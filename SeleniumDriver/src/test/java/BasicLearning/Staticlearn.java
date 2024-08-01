package BasicLearning;

public class Staticlearn {
	int x,y;// class variables
	static int a =15;//static variable
	int b=29;
	static String sstr="Dinesh";//non static variable
	static void m1() {//static method
		System.out.println("static method");
	}
	void m2() {
		System.out.println("non static method");
	}
	Staticlearn(int x,int y){//local variables
		this.x=x;
		this.y=y;
	}
	void display() {
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		Staticlearn s1=new Staticlearn(100,400);
		s1.display();
		System.out.println(a);//static variable can be called directly
		m1();// static method can be called directly without object
		s1.m2();
		System.out.println(s1.b);
		System.out.println(Staticlearn.sstr.length());//variable can acesss outside class
		

	}

}
