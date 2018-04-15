package oo.test002;

public class Cell {
	int row;
	int col;

	Cell(){
		this(0);
	}
	
	Cell(int n){
		this(n,n);
	}

	Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	void drop() {
		row++;
	}

	void moveLeft(int n) {
		col -= n;
	}

	void drop(int n) {
		row = +n;
	}

	void moveleft() {
		col--;
	}

	String getCellInfo() {
		return row + "," + col;
	}

}
