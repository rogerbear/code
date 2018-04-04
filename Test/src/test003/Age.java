package test003;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter age:");
		int age = scan.nextInt();
		System.out.println(age >= 18 && age<50);
	}

}
