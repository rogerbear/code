package test006;

public class MethodDemo {

	public static void main(String[] args) {
		sayHi();
		sayHi(" Tom");
		int m = plus(5, 6);
		System.out.println(m);
		int a = 5, b = 6;
		int k = plus(a, b);
		System.out.println(k);
		double n = Number();
		System.out.println(n);
	}

	public static void sayHi() {
		System.out.println("Hello!");
	}

	public static void sayHi(String name) {
		System.out.println("Hello" + name);
	}

	public static int plus(int a, int b) {
		int num = a + b;
		return num;
	}

	public static double Number() {
		return 8.88;
	}

}
