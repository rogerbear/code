package oo.test003;

public class TJTest {

	public static void main(String[] args) {
		/*
		 * T t = new T(2, 5); System.out.println("ԭʼλ�ã�"); t.print();
		 * 
		 * t.drop(); System.out.println("�����λ�ã�"); t.print();
		 * 
		 * t.moveLeft(); System.out.println("���ƺ�λ�ã�"); t.print();
		 * 
		 * t.moveRight(); System.out.println("���ƺ�λ�ã�"); t.print();
		 * 
		 * J j = new J(3, 6); System.out.println("ԭʼλ�ã�"); j.print();
		 * 
		 * j.drop(); System.out.println("�����λ�ã�"); j.print();
		 * 
		 * j.moveLeft(); System.out.println("���ƺ�λ�ã�"); j.print();
		 * 
		 * j.moveRight(); System.out.println("���ƺ�λ�ã�"); j.print();
		 */
		T t = new T(2, 6);
		printWall(t);

		Tetromino j = new J(1, 3);
		printWall(j);

	}

	public static void printWall(Tetromino t) {
		Cell[] cells = t.cells;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				boolean flag = false;
				for (int k = 0; k < cells.length; k++) {
					if (i == cells[k].row && j == cells[k].col) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
