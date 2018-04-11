package test006;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
	// 猜字符
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 记录猜错的次数
		int count = 0;
		// 生成5个字符
		char[] chs = generate();
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		// 自造死循环
		while (true) {
			System.out.println("请猜：");
			// 接收用户的串
			String str = scan.next().toUpperCase();
			// 判断字符串相等的方法
			if ("EXIT".equals(str)) {
				System.out.println("欢迎下次再来!");
				break;
			}
			// 将串转为数组
			char[] input = str.toCharArray();
			// 对比
			int[] result = check(chs, input);
			if (result[1] == chs.length) {
				int score = 100 * chs.length - count * 10;
				System.out.println("恭喜你答对了," + "得分为" + score);
				break;
			} else {
				// 猜错一次加1
				count++;
				System.out.println("字母对" + result[0] + "个" + "位置对" + result[1] + "个!");
			}
		}
	}

	// 随机生成5个字符数组
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

	// 比较
	public static int[] check(char[] chs, char[] input) {
		int[] result = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i] == input[j]) {
					result[0]++;// 字母对
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
