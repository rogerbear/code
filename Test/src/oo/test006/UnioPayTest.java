package oo.test006;

public class UnioPayTest {

	public static void main(String[] args) {
		ABCATM atm = new ABCATM();
		UnionPay card = new ABCImple();
		atm.insertCard(card);
		atm.payTelBill();
	}

}

class ABCATM {
	private UnionPay card;

	public void insertCard(UnionPay card) {
		this.card = card;
	}

	public void payTelBill() {
		if (card instanceof ABC) {
			ABC abcCard = (ABC) card;
			abcCard.payTelBill("12345678901", 300);
		} else {
			System.out.println("支付电话费失败，不是农行卡");
		}
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
		System.out.println("支付电话费成功");
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
