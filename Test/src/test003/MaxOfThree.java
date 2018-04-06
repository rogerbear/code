package test003;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈë3¸öÊý£º");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int temp = 0;
		scan.close();
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println("a=" + a + ",b=" + b + ",c=" + c);
	}

}
