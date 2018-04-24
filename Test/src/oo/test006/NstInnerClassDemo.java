package oo.test006;

public class NstInnerClassDemo {

	public static void main(String[] args) {
		/*
		 * 1.创建了Inter2的一个子类，没有名字 2.为该子类创建了一个对象，引用叫o1 3.大括号内的为子类的类体
		 */
		Inter2 o1 = new Inter2() {

		};

		final int num = 5;
		Inter3 o3 = new Inter3() {
			public void show() {
				System.out.println("showshow");
				System.out.println(num);//匿名内部类访问外部变量,外部变量需要加上final关键字
			}
		};
		o3.show();
	}

}

interface Inter3 {
	public void show();
}

interface Inter2 {

}