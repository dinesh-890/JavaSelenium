package Learnings;

public class StringsTest {

	public static void main(String[] args) {
		String s="Dinesh";
		String s1="Selenium";
		String s12="Selenium";
		//case-1:string comparision with ==
		System.out.println(s1==s12);
		System.out.println(s1.equals(s12));
		System.out.println("difference");
		String str1=new String("Welcome");
		String str2=new String("Welcome");
		System.out.println(str1==str2); //returns false as it compared objects and not value
		System.out.println(str1.equals(str2)); //return true as it compares value
		String str3=str2;
		System.out.println(str2==str3); //returns true as str2,str3 refers same object
		
		StringBuffer s3=new StringBuffer("JavaSelenium"); //string buffer declaration
		StringBuilder s4=new StringBuilder("sjuwdh"); //string builder declaration
		System.out.println(s4.reverse()+" "+s3.reverse());  //reverse method
		int n=s.length();
		String strrev="";
		String rev1="";
		String rev2="";
		char a[]=s1.toCharArray();
		for(int i=n-1;i>=0;i--) {
			strrev=strrev+s.charAt(i);
		}
		for(int j=a.length-1;j>=0;j--) {
			rev1=rev1+a[j];
		}
		System.out.println(strrev);
		System.out.println(rev1);//reversing string using character array
}

}
