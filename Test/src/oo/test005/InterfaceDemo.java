package oo.test005;

public class InterfaceDemo {

	public static void main(String[] args) {
		//Inter4 o1 = new Inter4();
		Inter4 o2 = new Eoo();
		Inter3 o3 = new Eoo();
	}
}

interface Inter1 {
	int NUM = 5;// public static final

	void show();// public abstract
}

interface Inter2 {
	void a();

	void b();
}

class Aoo implements Inter2 {
	public void a() {
	}

	public void b() {
	}
}

interface Inter3 {
	void c();
}

class Boo implements Inter2, Inter3 {
	public void a() {
	}

	public void b() {
	}

	public void c() {
	}
}

abstract class Coo {
	abstract void d();
}

class Doo extends Coo implements Inter2, Inter3 {
	void d() {
	}

	public void a() {
	}

	public void b() {
	}

	public void c() {
	}
}

interface Inter4 extends Inter3 {
	void e();
}

class Eoo implements Inter4{
	public void e() {}
	public void c() {}
}












