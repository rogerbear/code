package oo.test004;

public class J extends Tetromino{

	J(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row + 1, col);
		cells[2] = new Cell(row + 2, col);
		cells[3] = new Cell(row + 2, col + 1);
	}

	J() {
		this(0, 0);
	}
	
	void print() {
		System.out.println("i am a J:");
//		for (int i = 0; i < cells.length; i++) {
//			String str = cells[i].getCellInfo();
//			System.out.println(str);
//		}
		super.print();
	}

	
}
