package se.test002;

public class IntegerDemo2 {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		System.out.println(i1 == i2);//�ɻ���-128~127֮���ֵ��������Χ������new���� 
		
		Byte b = i1.byteValue();
		System.out.println(b);//-128��byte�����������ֵ+1������Сֵ

	}

}
