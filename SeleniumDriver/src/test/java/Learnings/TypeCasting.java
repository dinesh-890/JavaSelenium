package Learnings;

public class TypeCasting {

	public static void main(String[] args) {
		int i=90;
		long l=i; //upcasting is done automatically(Small to large)
		System.out.println(l);
		float f=10.0F;
		double d =f; //upcasting
		System.out.println(d);
		long p1=434544;
		int p=(int) p1;   //downcasting
		System.out.println(p);
		double d1=154.55;
		float ft=(float) d1;  //downcasting
		System.out.println(ft);
				
		

	}

}
