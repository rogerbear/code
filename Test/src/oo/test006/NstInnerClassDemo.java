package oo.test006;

public class NstInnerClassDemo {

	public static void main(String[] args) {
		/*
		 * 1.������Inter2��һ�����࣬û������ 2.Ϊ�����ഴ����һ���������ý�o1 3.�������ڵ�Ϊ���������
		 */
		Inter2 o1 = new Inter2() {

		};

		final int num = 5;
		Inter3 o3 = new Inter3() {
			public void show() {
				System.out.println("showshow");
				System.out.println(num);//�����ڲ�������ⲿ����,�ⲿ������Ҫ����final�ؼ���
			}
		};
		o3.show();
	}

}

interface Inter3 {
	public void show();
}

interface Inter2 {

}