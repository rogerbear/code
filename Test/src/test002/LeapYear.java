package test002;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scanner.nextInt();
		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();
		scanner.close();
		boolean isLittleMonth = month == 4 || month == 6 || month == 9 || month == 11;
		boolean isLargeMonth = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		int days = isLittleMonth ? 30 : (isLargeMonth ? 31 : (isLeapYear ? 29 : 28));
		String msg = isLeapYear ? year + "������" : year + "��������";
		System.out.println(msg);
		System.out.println(year+"��"+month+"����"+days+"��");
	}

}
