package se.test001;

public class StringBuilderDemo2 {

	public static void main(String[] args) {
		/*
		 * 普通字符串追加会不断创建新对象字符串，执行慢
		 */
//		String str = "a";
//		for (int i = 0; i < 1000000; i++) {
//			str += "a";
//		}
//		System.out.println(str);

		/*
		 * 用StringBuilder追加会复用之前的对象，执行快
		 */
		StringBuilder builder = new StringBuilder("a");
		for (int i = 0; i < 1000000; i++) {
			builder.append("a");
		}
		System.out.println("done");
	}

}
