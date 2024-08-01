package BasicLearning;

public class Polymorphism {
	int x,y,k,l,num;
	String nam;

void method12(int a,int b) {  //same method name with different parameters-method overloading
	x=a;
	y=b;
	System.out.println(a+" "+b);
	}
void method12(int salary,int sal,int p) {
	System.out.println(salary+" "+sal+" "+p);
}
Polymorphism(int a,int b)//parameterized 
{
	k=a;
	l=b;
}
Polymorphism()//default
{
	num=60;
	nam="John";
	
}
  public static void main(String[] args) {
	  Polymorphism st1=new Polymorphism();
	  Polymorphism st2=new Polymorphism(40,68);
	  st1.method12(25,30);
		st1.method12(100,200,300);

	}

}
