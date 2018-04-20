package oo.test004.vis;

public class S extends Tetromino {
	S(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row, col + 1);
		cells[2] = new Cell(row + 1, col - 1);
		cells[3] = new Cell(row + 1, col);
	}

	S() {
		this(0, 0);
	}

	void print() {
		System.out.println("i am a S:");
		super.print();
	}

}
