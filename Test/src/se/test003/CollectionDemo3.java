package se.test003;

import java.util.ArrayList;
import java.util.Collection;

import se.test002.Point;

public class CollectionDemo3 {

	public static void main(String[] args) {
		/*
		 * 集合存放元素是元素的引用
		 */
		Collection c = new ArrayList();
		Point p = new Point(1, 2);
		c.add(p);
		System.out.println(c);// [(1,2)]

		p.setX(2);
		System.out.println(p);
		System.out.println(c);// [(2,2)]，由于存放的是x的地址，所以x的值改变了，集合里面的x也会改变

	}

}
