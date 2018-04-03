package test002;

import java.util.Scanner;

public class FreeFall {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a time:");
		double g = 9.80;
		double t = scanner.nextDouble();
		double s = 0.5 * g * t * t;
		s = Math.round(s * 10) / 10.0;
		System.out.println("total:" + s);
	}

}
