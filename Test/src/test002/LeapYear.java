package test002;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scanner.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		String msg = isLeapYear ? year + "������" : year + "��������";
		System.out.println(msg);
	}

}
