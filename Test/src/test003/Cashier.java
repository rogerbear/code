package test003;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����뵥�ۣ�");
		double price = scan.nextDouble();
		System.out.println("�����빺��������");
		int amount = scan.nextInt();
		System.out.println("���Ľ�");
		double money = scan.nextDouble();
		double total = price * amount;
		if(total>=500) {
			total*=0.8;
		}
		if(money>=total) {
			double return_pay = money - total;
			System.out.println("�һ�"+return_pay);
		}else {
			System.out.println("�����Ǯ������");
		}
	}

}
