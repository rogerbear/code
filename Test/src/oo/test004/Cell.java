package oo.test004;

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

	String getCellInfo() {
		return row + "," + col;
	}

}
