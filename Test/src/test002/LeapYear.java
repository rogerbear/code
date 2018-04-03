package test002;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		String msg = isLeapYear ? year + "是闰年" : year + "不是闰年";
		System.out.println(msg);
	}

}
