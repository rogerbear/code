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
		System.out.println("父型参数");
		o.show();
	}

	void test(Foo o) {
		System.out.println("子型参数");
		o.show();
	}
}

class Eoo {
	void show() {
		System.out.println("父类方法");
	}
}

class Foo extends Eoo {
	void show() {
		System.out.println("子类方法");
	}
}
