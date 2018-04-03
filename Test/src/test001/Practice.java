package test001;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Tom and Merry");
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter first member:");
		String first = scanner.next();
		System.out.println("please enter second member:");
		String second = scanner.next();
		scanner.close();
		System.out.println(first + " and " +second);
		
	}
}
