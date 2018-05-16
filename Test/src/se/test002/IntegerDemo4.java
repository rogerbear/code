package se.test002;

public class IntegerDemo4 {

	public static void main(String[] args) {
		String str = "123";
		String str1 = "a";
		String str2 = "123.456";
		Integer i = Integer.parseInt(str);
		System.out.println(i+1);

//		Integer i2 = Integer.parseInt(str1);// 不同类型不能转换
//		System.out.println(i2);
//
//		Integer i3 = Integer.parseInt(str2);// 小数类型不能转换
//		System.out.println(i3);

		Double d = Double.parseDouble(str);
		System.out.println(d);

	}

}
