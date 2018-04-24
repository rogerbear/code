package oo.test005;

public class ShapeTest2 {

	public static void main(String[] args) {
		Shape2[] shape = new Shape2[6];
		shape[0] = new Squre2(1);
		shape[1] = new Squre2(2);
		shape[2] = new Circle2(1);
		shape[3] = new Circle2(2);
		shape[4] = new Six(3);
		shape[5] = new Six(5);
		maxArea2(shape);
	}

	public static void maxArea2(Shape2[] shape) {
		double max = shape[0].area();
		int index = 0;
		for (int i = 0; i < shape.length; i++) {
			if (shape[i].area() > max) {
				max = shape[i].area();
				index = i;
			}
		}
		System.out.println("最大值是：" + max + "，位置是：" + index);
	}

}

class Goo{
	void study() {
		
	}
}

abstract class Hoo extends Goo {
	
}

abstract class Shape2 {
	double c;

	public abstract double area();
}

class Squre2 extends Shape2 {
	Squre2(double c) {
		this.c = c;
	}

	public double area() {
		return 0.625 * c * c;
	}
}

class Circle2 extends Shape2 {
	Circle2(double c) {
		this.c = c;
	}

	public double area() {
		return 0.725 * c * c;
	}
}

class Six extends Shape2 {
	Six(double c) {
		this.c = c;
	}

	public double area() {
		return 0.5 * c * c;
	}
}
