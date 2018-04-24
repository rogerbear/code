package oo.test006;

public class DebugDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int n = plus(a, b);
		System.out.println(n);
		show();
		System.out.println("over");
	}

	public static int plus(int a, int b) {
		return a + b;
	}

	public static void show() {
		System.out.println(111);
	}

}
