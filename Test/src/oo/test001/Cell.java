package oo.test001;

public class Cell {
	int row;
	int col;

	void drop() {
		row++;
	}

	void moveLeft(int n) {
		col -= n;
	}

	String getCellInfo() {
		return row + "," + col;
	}
	
	
}
