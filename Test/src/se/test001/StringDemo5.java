package se.test001;

public class StringDemo5 {

	public static void main(String[] args) {
		String str = "thinking in java";
		System.out.println(str.charAt(5));

		/*
		 * �ж��Ƿ�Ϊ���ģ����Ϻ�����ˮ���Ժ��ϡ�
		 */
		/*
		 * ����һ
		 */
//		String str1 = "�Ϻ�����ˮ454���Ժ���";
//		for (int i = 0; i < str1.length() / 2; i++) {
//			if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
//				System.out.println("���ǻ���");
//				return;//��������main����
//			}
//		}
//		System.out.println("�ǻ���");

		/*
		 * ������
		 */
		String str2 = "�Ϻ�����ˮ454���Ժ���";
		boolean flag = true;
		for (int i = 0; i < str2.length() / 2; i++) {
			if (str2.charAt(i) != str2.charAt(str2.length() - i - 1)) {
				System.out.println("���������ǻ���");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("�������ǻ���");
		}
	}

}
