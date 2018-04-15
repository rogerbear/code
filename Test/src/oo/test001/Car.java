package oo.test001;

public class Car {
	double price;
	String brand;
	String color;

	void show() {
		System.out.println("牌子为" + brand + "颜色为" + color + "价格为" + price);
	}

	void startup() {
		System.out.println(brand + "品牌的车子启动了！");
	}

}
