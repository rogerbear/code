package se.test002;

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		/*
		 * 重写toString方法后输出
		 */
		// String str = p1.toString();
		// System.out.println(str);

		/*
		 * 直接输出
		 */
		System.out.println(p1);

		Point p2 = new Point(1, 2);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
	}

}
