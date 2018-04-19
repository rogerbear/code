package oo.test004;

public class T extends Tetromino {

	T(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row, col + 1);
		cells[2] = new Cell(row, col + 2);
		cells[3] = new Cell(row + 1, col + 1);
	}

	T() {
		this(0, 0);
	}
	
	void print() {
		System.out.println("i am a T:");
//		for (int i = 0; i < cells.length; i++) {
//			String str = cells[i].getCellInfo();
//			System.out.println(str);
//		}
		super.print();
	}
}
