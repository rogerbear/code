package se.test003;

import java.util.ArrayList;
import java.util.Collection;

import se.test002.Point;

public class CollectionDemo2 {

	public static void main(String[] args) {
		/*
		 * 集合是否包含给定元素
		 */
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		System.out.println(c);
		
		/*
		 * 集合判断是否包含元素是根据元素的equals来比较的
		 */
		Point p = new Point(1,2);
		boolean contains = c.contains(p);
		System.out.println(contains);//由于Point重写了equals方法，所以为ture，如果不重写则为false
	}

}
