package test006;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		for (int num = 2; num <= 100; num++) {
			boolean flag = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			
			}
			if (flag) {
				System.out.print(num + "\t");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

}
