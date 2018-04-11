package test006;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
	// ���ַ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ��¼�´�Ĵ���
		int count = 0;
		// ����5���ַ�
		char[] chs = generate();
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		// ������ѭ��
		while (true) {
			System.out.println("��£�");
			// �����û��Ĵ�
			String str = scan.next().toUpperCase();
			// �ж��ַ�����ȵķ���
			if ("EXIT".equals(str)) {
				System.out.println("��ӭ�´�����!");
				break;
			}
			// ����תΪ����
			char[] input = str.toCharArray();
			// �Ա�
			int[] result = check(chs, input);
			if (result[1] == chs.length) {
				int score = 100 * chs.length - count * 10;
				System.out.println("��ϲ������," + "�÷�Ϊ" + score);
				break;
			} else {
				// �´�һ�μ�1
				count++;
				System.out.println("��ĸ��" + result[0] + "��" + "λ�ö�" + result[1] + "��!");
			}
		}
	}

	// �������5���ַ�����
	public static char[] generate() {
		char[] chs = new char[5];
		Random rand = new Random();
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		boolean[] flags = new boolean[letters.length];
		for (int i = 0; i < chs.length; i++) {
			int index;
			do {
				index = rand.nextInt(letters.length);
			} while (flags[index]);
			chs[i] = letters[index];
			flags[index] = true;
		}
		return chs;
	}

	// �Ƚ�
	public static int[] check(char[] chs, char[] input) {
		int[] result = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i] == input[j]) {
					result[0]++;// ��ĸ��
					if (i == j) {
						result[1]++;
					}
					break;
				}
			}
		}
		return result;
	}
}
