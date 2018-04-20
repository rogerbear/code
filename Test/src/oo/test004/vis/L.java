package oo.test004.vis;

public class L extends Tetromino {
	L(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row + 1, col);
		cells[2] = new Cell(row + 2, col);
		cells[3] = new Cell(row + 2, col + 1);
	}

	L() {
		this(0, 0);
	}

	void print() {
		System.out.println("i am a L:");
		super.print();
	}
}
