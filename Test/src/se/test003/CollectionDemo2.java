package se.test003;

import java.util.ArrayList;
import java.util.Collection;

import se.test002.Point;

public class CollectionDemo2 {

	public static void main(String[] args) {
		/*
		 * �����Ƿ��������Ԫ��
		 */
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		System.out.println(c);
		
		/*
		 * �����ж��Ƿ����Ԫ���Ǹ���Ԫ�ص�equals���Ƚϵ�
		 */
		Point p = new Point(1,2);
		boolean contains = c.contains(p);
		System.out.println(contains);//����Point��д��equals����������Ϊture���������д��Ϊfalse
	}

}
