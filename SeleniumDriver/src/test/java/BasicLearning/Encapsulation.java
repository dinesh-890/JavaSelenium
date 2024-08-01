package BasicLearning;

public class Encapsulation {
	private int accno;
	private String Accname;
	private double balance;
	/*void setaccno(int accno) {
		this.accno=accno;//different variable can be used instead of same
	}
	int  getAccnum() {
		return accno;
	}
*/
	public static void main(String[] args) {
		Encapsulation en=new Encapsulation();
		en.setAccno(848);
		System.out.println(en.getAccno());
		en.setAccname("Dinesh");
		System.out.println(en.getAccname());
		en.setBalance(1000);
		System.out.println(en.getBalance());
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAccname() {
		return Accname;
	}

	public void setAccname(String accname) {
		Accname = accname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
