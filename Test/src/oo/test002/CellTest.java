package oo.test002;

public class CellTest {

	public static void main(String[] args) {
		Cell c = new Cell();
		Cell c1 = new Cell(5);
		Cell c2 = new Cell(2, 4);
		System.out.println("before c2:" + c2.row + " " + c2.col);

		c2.drop();
		c2.drop(1);
		c2.moveleft();
		c2.moveLeft(2);

		System.out.println("c2:" + c2.row + " " + c2.col);

		System.out.println(c.row + " " + c.col);
		System.out.println(c1.row + " " + c1.col);
		System.out.println(c2.row + " " + c2.col);

		/*
		 * Cell c = new Cell(); c.drop(); c.drop(3); c.moveleft(); c.moveLeft(2);
		 */
	}

	public static void printWall(Cell cc) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == cc.row && j == cc.col) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
