package oo.test001;

public class CellTest {

	public static void main(String[] args) {
		/*
		 * Cell c = new Cell(); c.row = 2; c.col = 5; c.drop(); c.moveLeft(3); String
		 * str = c.getCellInfo(); System.out.println(str);
		 */
		Cell c = new Cell();
		c.row = 2;
		c.col = 5;
		System.out.println("原始位置：");
		printWall(c);

		c.drop();
		System.out.println("下移后位置：");
		printWall(c);

		c.moveLeft(3);
		System.out.println("左移后位置");
		printWall(c);

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
