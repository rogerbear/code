package oo.test005;

public class UnioPayTest {

	public static void main(String[] args) {

	}

}

interface UnionPay {
	double getBalance();

	boolean checkPwd(String input);

	boolean drawMonkey(double num);
}

interface ICBC extends UnionPay {
	void payOnline(double num);
}

interface ABC extends UnionPay {
	void payTelBill(String num, double monkey);
}

interface CCB extends UnionPay {
	void payWater(double num, double monkey);
}

class ICBCImple implements ICBC {
	public double getBalance() {
		return 0.0;
	}

	public boolean checkPwd(String input) {
		return true;
	}

	public boolean drawMonkey(double num) {
		return true;
	}

	public void payOnline(double num) {
	}

}

class ABCImple implements ABC {
	public double getBalance() {
		return 0.0;
	}

	public boolean checkPwd(String input) {
		return true;
	}

	public boolean drawMonkey(double num) {
		return true;
	}

	public void payTelBill(String number, double monkey) {

	}

}

class CCBImple implements CCB {
	public double getBalance() {
		return 0.0;
	}

	public boolean checkPwd(String num) {
		return true;
	}

	public boolean drawMonkey(double monkey) {
		return true;
	}

	public void payWater(double num, double monkey) {

	}
}
