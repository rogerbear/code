package se.test001;

public class StringBuilderDemo2 {

	public static void main(String[] args) {
		/*
		 * ��ͨ�ַ���׷�ӻ᲻�ϴ����¶����ַ�����ִ����
		 */
//		String str = "a";
//		for (int i = 0; i < 1000000; i++) {
//			str += "a";
//		}
//		System.out.println(str);

		/*
		 * ��StringBuilder׷�ӻḴ��֮ǰ�Ķ���ִ�п�
		 */
		StringBuilder builder = new StringBuilder("a");
		for (int i = 0; i < 1000000; i++) {
			builder.append("a");
		}
		System.out.println("done");
	}

}
