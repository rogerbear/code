package oo.test003;

public class TJTest {

	public static void main(String[] args) {
		T t = new T(2, 5);
		System.out.println("ԭʼλ�ã�");
		t.print();

		t.drop();
		System.out.println("�����λ�ã�");
		t.print();

		t.moveLeft();
		System.out.println("���ƺ�λ�ã�");
		t.print();

		t.moveRight();
		System.out.println("���ƺ�λ�ã�");
		t.print();

		J j = new J(3, 6);
		System.out.println("ԭʼλ�ã�");
		j.print();

		j.drop();
		System.out.println("�����λ�ã�");
		j.print();

		j.moveLeft();
		System.out.println("���ƺ�λ�ã�");
		j.print();

		j.moveRight();
		System.out.println("���ƺ�λ�ã�");
		j.print();
	}

}
