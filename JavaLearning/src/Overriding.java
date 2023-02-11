//example of hierarchial type
//method overriding
class Bank{
	public int rateInterest() {
		return 0;
	}
}

class SBI extends Bank {
	public int rateInterest() {
		//super.rateInterest();
		return 5;
	}
}

class HDFC extends Bank {
	public int rateInterest() {
		return 10;
	}
}
public class Overriding {
	public static void main(String[] args) {
		SBI b1 = new SBI();
		HDFC b2 = new HDFC();
		int r1= b1.rateInterest();
		System.out.println("rate of SBI: "+r1);
		int r2=b2.rateInterest();
		System.out.println("rate of HDFC: "+r2);
	}
}