package BasicLearning;

class Bank{
	double roi() {
		return 0;
	}
}
class Hdfc extends Bank{
	double roi() {
		return 10.5;
	}
}
class SBI extends Bank{
	double roi() {
		return 12.5;
	}
}	
public class MthodOverriding {

	public static void main(String[] args) {
		Hdfc b1=new Hdfc();
		System.out.println(b1.roi());
		SBI c1=new SBI();
		System.out.println(c1.roi());
		
		

	}

}
