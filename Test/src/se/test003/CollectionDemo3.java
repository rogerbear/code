package se.test003;

import java.util.ArrayList;
import java.util.Collection;

import se.test002.Point;

public class CollectionDemo3 {

	public static void main(String[] args) {
		/*
		 * ���ϴ��Ԫ����Ԫ�ص�����
		 */
		Collection c = new ArrayList();
		Point p = new Point(1, 2);
		c.add(p);
		System.out.println(c);// [(1,2)]

		p.setX(2);
		System.out.println(p);
		System.out.println(c);// [(2,2)]�����ڴ�ŵ���x�ĵ�ַ������x��ֵ�ı��ˣ����������xҲ��ı�

	}

}
