package BasicLearning;

import java.util.Arrays;

public class StringPrograms {

	public static void main(String[] args) {
		String str= "The sun@ rises in the #east the sun in the east";
		String s[]=str.split("@"); //splitting string based on delimiter
		System.out.println(s[0]);
		System.out.println(Arrays.toString(s)); //print string in array
		System.out.println(str.replace('h','r'));  //replaces character
		System.out.println(str.replace("sun","Yes")); //replaces string
		System.out.println("Substring is "+str.substring(4,14));// returns substring
		System.out.println("letter at index 5 is: "+str.charAt(5));//returns character from particular position
        str=str.toLowerCase();//converts string to lower letters
        System.out.println(str.contains("sun"));//returns boolean if string present or not
        int c1=str.length();
        int k=str.replace("e","").length();//counting frequency of characters in string
        String s1=" is";
        String s2=" truth";
        System.out.println(s1.equals(s2)); //compares 2 strings
        System.out.println(str.concat(s1));//joins 2 strings
        System.out.println(str.concat(s1).concat(s2)); //joins 3 strings
        System.out.println("number of e's in string:"+ (c1-k));
        int vcount=0;
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i) == 'a'   || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'   || str.charAt(i) == 'u') {
        	vcount++;	
         }
	}
	System.out.println(vcount); //count number of vowels
}
}

