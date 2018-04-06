package test003;

import java.util.Scanner;

public class MinOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈë3¸öÊý");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		int temp = a;
		if (a > b) {
			temp = b;
		}
		if (temp > c) {
			temp = c;
		}
		System.out.println(temp);
	}

}
