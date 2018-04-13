package oo.test001;

public class Student {
	String name;
	int age = 31;
	String sex;

	void study() {
		System.out.println(name + "在学习");
	}

	void info() {
		System.out.println("我叫" + name + "今年" + age + "岁，" + sex);
	}
}
