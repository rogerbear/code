package test004;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		for (int i = 1; i <= 10; i++) {
			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			int result = a + b;
			System.out.println("(" + i + ")" + a + "+" + b + "=");
			int answer = scan.nextInt();
			if (answer == -1) {
				break;
			}
			if (answer == result) {
				System.out.println("�����");
				score += 10;
			} else {
				System.out.println("�����");
			}
		}
		System.out.println("�����" + score / 10 + "����," + "��" + score + "��");
	}

}
