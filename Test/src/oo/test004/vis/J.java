package oo.test004.vis;

public class J extends Tetromino {
	J(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row, col + 1);
		cells[2] = new Cell(row, col + 2);
		cells[3] = new Cell(row + 1, col + 2);
	}

	J() {
		this(0, 0);
	}

	void print() {
		System.out.println("i am a J:");
		super.print();
	}

}
