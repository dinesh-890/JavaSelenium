package BasicLearning;

public class ConstructorLoading {
	int x,y,k,l,num;
	String nam;

	ConstructorLoading(int a,int b)//parameterized 
{
	k=a;
	l=b;
}
	ConstructorLoading()//default
{
	num=60;
	nam="John";
}
	int product(int m,int n) {
		return m*n;
	}
  public static void main(String[] args) {
	  ConstructorLoading st1=new ConstructorLoading();
	  ConstructorLoading st2=new ConstructorLoading(40,68);
	  System.out.println(st2.product(20,40));
	  
	}

}
