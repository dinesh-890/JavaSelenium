package Learnings;

public class AccessModifier2 {

	public static void main(String[] args) {
		AccessModifiers ac=new AccessModifiers();
		//System.out.println(ac.x); //variable not displayed as its private which is outside class
		//ac.m1(); //method not displayed as its private which is outside class
		System.out.println(ac.b); // default variables
		ac.m2(); //default method within package

	}

}
