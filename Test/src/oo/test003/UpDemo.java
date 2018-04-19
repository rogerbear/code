package oo.test003;

public class UpDemo {

	public static void main(String[] args) {
		Coo o1 = new Coo();
		o1.a = 3;
		o1.say();

		Doo o2 = new Doo();
		o2.b = 2;
		o2.show();
		o2.a = 5;
		o2.say();

		Coo o3 = new Doo();
		o3.a = 7;
		o3.say();

	}

}

class Coo {
	int a;

	void say() {

	}
}

class Doo extends Coo {
	int b;

	void show() {

	}
}
