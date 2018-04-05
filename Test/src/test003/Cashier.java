package test003;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入单价：");
		double price = scan.nextDouble();
		System.out.println("请输入购买数量：");
		int amount = scan.nextInt();
		System.out.println("付的金额：");
		double money = scan.nextDouble();
		double total = price * amount;
		if(total>=500) {
			total*=0.8;
		}
		if(money>=total) {
			double return_pay = money - total;
			System.out.println("找回"+return_pay);
		}else {
			System.out.println("你给的钱不够！");
		}
	}

}
