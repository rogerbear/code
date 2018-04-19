package oo.test003;

public class superDemo {

	public static void main(String[] args) {

	}

	class Aoo {
		int a;

		Aoo(int a) {
			this.a = a;
		}
	}

	class Boo extends Aoo {
		Boo() {
			super(5);
		}
	}

}
