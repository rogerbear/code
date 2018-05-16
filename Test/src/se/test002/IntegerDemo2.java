package se.test002;

public class IntegerDemo2 {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		System.out.println(i1 == i2);//可缓存-128~127之间的值，超过范围会重新new对象 
		
		Byte b = i1.byteValue();
		System.out.println(b);//-128，byte类型由于最大值+1就是最小值

	}

}
