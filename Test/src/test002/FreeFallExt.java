package test002;

import java.util.Scanner;

public class FreeFallExt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter miles:");
		double g = 9.80;
		double s = scanner.nextDouble();
		scanner.close();
		double t = Math.sqrt(2 * s / g);
		t = Math.round(10 * t) / 10.0;
		System.out.println("time:" + t);
	}

}
