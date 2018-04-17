package oo.test003;

public class O extends Tetromino{
	O(int row, int col) {
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row, col + 1);
		cells[2] = new Cell(row + 1, col);
		cells[3] = new Cell(row + 1, col + 1);
	}

	O() {
		this(0, 0);
	}

	

}
