package test004;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("²Â°É!");
		int num = 100;
		int guessing = scan.nextInt();
		while(guessing != num) {
			System.out.println("¼ÌÐø²Â");
			guessing = scan.nextInt();
		}
		System.out.println("¹§Ï²Äã²Â¶ÔÁË");
	}

}
