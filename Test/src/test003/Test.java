package test003;

public class Test {

	public static void main(String[] args) {
		int a = 5;

		/** 
		 * int b �൱��:5 + 6 + 7 = 18
		 * ִ����a++[����]��a��������,����ִ���������������a������,������ͬһ�������a++�Ժ��a���������Ժ��ֵ
		 */
		int b = a++ + a++ + a;

		// a������������,��������ֵ��7
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
