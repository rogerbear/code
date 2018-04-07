package test004;

public class Homework {

	public static void main(String[] args) {
		long nine = 0;
		long sum = 0;
		for (int i = 1; i <= 10; i++) {
			nine = nine * 10 + 9;
			System.out.println(nine);
			sum += nine;
		}
		System.out.println(sum);

		int n = 15;
		double sum_2 = 0;
		for (int j = 1; j <= n; j++) {
			sum_2 = sum_2 + 1.0/j;
		}
		System.out.println(sum_2);

	}

}
