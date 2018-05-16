package se.test002;

/**
 * JDK1.5后新增一个自动拆装箱特性 编译器认可，不是虚拟机认可，编译器自动补充代码完成基本类型和包装类型的转换
 * 
 * @author roger
 *
 */
public class IngeterDemo5 {

	public static void main(String[] args) {
		Integer i = 123;// 自动装箱，基本类型赋值给包装类型 Integer i = Integer.valueOf(123);
		int ii = new Integer(456);// 自动拆箱，包装类的值可以赋值给基本类型 int ii = new Integer(456).intValue();
	}

}
