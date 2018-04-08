package test006;

import java.util.Arrays;

public class Homework {

	public static void main(String[] args) {
		// 判断是否是质数(2~某个范围)
		int count = 0;
		for (int num = 2; num <= 100; num++) {
			//System.out.println(Math.sqrt(num));
			boolean flag = true;
			// for (int i = 2; i < num / 2; i++) {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				System.out.print(num+"\t");
				if(count%10==0) {
					System.out.println();
				}
			} 
		}

		// 最小值插入数组第一个元素位置
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.println("随机数是："+arr[i]);
		}

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min:" + min);

		int[] arr1 = new int[arr.length + 1];
		System.arraycopy(arr, 0, arr1, 1, arr.length);
		arr1[0] = min;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
