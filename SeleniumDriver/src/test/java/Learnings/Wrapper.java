package Learnings;

public class Wrapper {

	public static void main(String[] args) {
		String s1="1736";
		int i=Integer.parseInt(s1); //converting string to integer
		System.out.println(i);
		String s2="10.5";
		System.out.println(Double.parseDouble(s2)); //converting to decimal
		//TO STRING FORMAT
		int a=10;
		double d=19.8;
		char c='d';
		boolean b=true;
		String s3=String.valueOf(a);  //converts int to string
		String s4=String.valueOf(d);
		String s5=String.valueOf(c);
		String s6=String.valueOf(b);
		System.out.println(a+" "+d+" "+c+" "+b);
		
		
				

	}

}
