package Collections;

import java.util.HashMap;

public class StringExamples {

	public static void main(String[] args) {
		String s="selenium";
		//System.out.println(s.trim());
		String rev="";
		//String rev1=s;  //string main string in another
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);  //reversing string in array
		}
		System.out.println(rev);
		if(s.equals(rev)) { //compares string values
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		String str="aaabbrccagetygddef";
		HashMap <Character,Integer> hm1=new HashMap <Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(hm1.containsKey(c)) {
				int count=hm1.get(c);
				count++;
				hm1.replace(c, count);
			}
			else {
				hm1.put(c, 1);
			}
		}
		System.out.println(hm1.toString());

	}

}
