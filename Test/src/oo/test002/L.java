package oo.test002;

public class L {
	Cell[] cells;

	L(int row, int col) {
		cells = new Cell[4];
		cells[0] = new Cell(row, col);
		cells[1] = new Cell(row + 1, col);
		cells[2] = new Cell(row + 2, col);
		cells[3] = new Cell(row + 2, col + 1);
	}

	L() {
		this(0, 0);
	}

	void drop() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].row++;
		}
	}

	void moveLeft() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].col--;
		}
	}

	void moveRight() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].col++;
		}
	}

	void print() {
		for (int i = 0; i < cells.length; i++) {
			String str = cells[i].getCellInfo();
			System.out.println(str);
		}
	}

}
