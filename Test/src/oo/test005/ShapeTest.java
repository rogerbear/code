package oo.test005;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Squre(1);
		shapes[1] = new Squre(2);
		shapes[2] = new Circle(1);
		shapes[3] = new Circle(2);
		maxArea(shapes);
	}

	public static void maxArea(Shape[] shapes) {
		double max = shapes[0].area();
		int index = 0;
		for (int i = 0; i < shapes.length; i++) {
			double area = shapes[i].area();
			if (area > max) {
				max = area;
				index = i;
			}
		}
		System.out.println("最大值为" + max + "下标为" + index);
	}

}

abstract class Shape {
	double c;

	public abstract double area();
}

class Squre extends Shape {
	Squre(double c) {
		this.c = c;
	}

	public double area() {
		return 0.625 * c * c;
	}
}

class Circle extends Shape {
	Circle(double c) {
		this.c = c;
	}

	public double area() {
		return 0.725 * c * c;
	}
}
