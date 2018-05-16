package se.test001;

public class StringDemo5 {

	public static void main(String[] args) {
		String str = "thinking in java";
		System.out.println(str.charAt(5));

		/*
		 * 判断是否为回文，“上海自来水来自海上”
		 */
		/*
		 * 方法一
		 */
//		String str1 = "上海自来水454来自海上";
//		for (int i = 0; i < str1.length() / 2; i++) {
//			if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
//				System.out.println("不是回文");
//				return;//结束整个main方法
//			}
//		}
//		System.out.println("是回文");

		/*
		 * 方法二
		 */
		String str2 = "上海自来水454来自海上";
		boolean flag = true;
		for (int i = 0; i < str2.length() / 2; i++) {
			if (str2.charAt(i) != str2.charAt(str2.length() - i - 1)) {
				System.out.println("方法二不是回文");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("方法二是回文");
		}
	}

}
