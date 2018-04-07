package test005;

import java.util.Arrays;

public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.println(arr[i]);
		}
		int max = arr[0];
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}
		System.out.println("最大值为" + max);
		// 数组扩容
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = max;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 复制1
		int[] b = { 10, 20, 30, 40, 50 };
		int[] b1 = Arrays.copyOf(b, 8);
		for (int i = 0; i < b1.length; i++) {
			System.out.println("复制1：" + b1[i]);
		}

		// 复制2
		int[] a = { 10, 20, 30, 40, 50 };
		int[] a1 = new int[6];
		System.arraycopy(a, 0, a1, 3, 3);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}

}
