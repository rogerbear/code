package test002;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����򣩣�");
		double p = scanner.nextDouble() * 10000;
		System.out.println("�����ʣ�%����");
		double r = scanner.nextDouble() / 1200;
		System.out.println("����������");
		double m = scanner.nextInt() * 12;
		double payment = (p * r * Math.pow((1 + r), m)) / (Math.pow((1 + r), m) - 1);
		payment = Math.round(payment * 100) / 100.0;
		System.out.println("ÿ�»���"+payment);
	}

}
