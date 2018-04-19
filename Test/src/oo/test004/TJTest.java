package oo.test004;

public class TJTest {

	public static void main(String[] args) {
		/*
		T t = new T();
		t.print();
		
		J j = new J();
		j.print();
		*/
		
		Tetromino t = new T();
		t.print();
		
		Tetromino j = new J();
		j.print(); 

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
