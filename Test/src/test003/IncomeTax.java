package test003;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入工资:");
		double salary = scan.nextDouble();
		double tax = 0;
		double taxIncome = salary - 3500;

		if (taxIncome <= 0) {
			tax = 0;
		} else if (taxIncome <= 1500) {
			tax = taxIncome * 0.03;
		} else if (taxIncome <= 4500) {
			tax = taxIncome * 0.10 - 105;
		} else if (taxIncome <= 9000) {
			tax = taxIncome * 0.20 - 555;
		} else if (taxIncome <= 35000) {
			tax = taxIncome * 0.25 - 1005;
		} else if (taxIncome <= 55000) {
			tax = taxIncome * 0.30 - 2755;
		} else if (taxIncome <= 80000) {
			tax = taxIncome * 0.35 - 5505;
		} else {
			tax = taxIncome * 0.45 - 13505;
		}
		System.out.println("应纳税金为：" + tax);
	}

}
