package oo.test004;

public class FinalDemo {

	public static void main(String[] args) {
		
	}

}

final class Roo{
	
}

//class Soo extends Roo{}//final�಻�ܱ��̳�

class Poo{
	final void show() {}
	void test() {}
}

class Qoo extends Poo{
	//void show() {} //final�������ܱ���д
	void test() {}
}


class Ooo{
	final int a = 5;
	final int b;
	Ooo(){
		b = 6;
	}
	
	void show() {
		final int c;
		//a = 55;//final���ܱ��޸�
	}
}