package oo.test004.vis;

public class Cell {
	int row;
	int col;

	Cell() {
		this(0);
	}

	Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	Cell(int n) {
		this(n, n);
	}

	String getCellInfo() {
		return row + "," + col;
	}

}
