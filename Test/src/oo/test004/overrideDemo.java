package oo.test004;

public class overrideDemo {

	public static void main(String[] args) {
		Goo goo = new Goo();
		Eoo o = new Foo();
		goo.test(o);
	}

}

class Goo {
	void test(Eoo o) {
		System.out.println("���Ͳ���");
		o.show();
	}

	void test(Foo o) {
		System.out.println("���Ͳ���");
		o.show();
	}
}

class Eoo {
	void show() {
		System.out.println("���෽��");
	}
}

class Foo extends Eoo {
	void show() {
		System.out.println("���෽��");
	}
}
