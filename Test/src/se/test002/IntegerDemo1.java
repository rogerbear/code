package se.test002;

public class IntegerDemo1 {

	public static void main(String[] args) {
		dosome("abc");
		dosome(1);
		dosome(new Point(1, 2));
		int i = 2;
		dosome(i);

		Integer ii = new Integer(i);
		int a = ii.intValue();
		System.out.println(a);
	}

	public static void dosome(Object obj) {

	}

}

//class Integer {
//	private int i;
//
//	public Integer(int i) {
//		this.i = i;
//	}
//
//	public int intValue() {
//		return i;
//	}
//
//}
