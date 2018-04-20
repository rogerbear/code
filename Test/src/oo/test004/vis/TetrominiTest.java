package oo.test004.vis;

public class TetrominiTest {

	public static void main(String[] args) {
		Tetromino t = new T(3, 6);
		t.drop();
		t.print();
		printWall(t);

		Tetromino s = new S(4, 6);
		s.moveLeft();
		s.print();
		printWall(s);

	}

	public static void printWall(Tetromino s) {
		Cell[] cells = s.cells;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				boolean flag = false;
				for (int k = 0; k < cells.length; k++) {
					if (i == cells[k].row && j == cells[k].col) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
