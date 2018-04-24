package oo.test006;

public class InnerClassDemo {

	public static void main(String[] args) {
		Mama ma = new Mama();
		// Baby ba = new Baby();
		ma.creatBaby().showMamaName();
		ma.ba.showMamaName();
	}

}

class Mama {
	private String name;

	Baby ba = new Baby();

	Baby creatBaby() {
		return new Baby();
	}

	public void mamaPrint() {
		System.out.println("mama");
	}

	// Baby ba = new Baby();
	class Baby {
		public void showMamaName() {
			System.out.println(name);
			System.out.println(Mama.this.name);
			// System.out.println(this.name);
			mamaPrint();
		}
	}
}
