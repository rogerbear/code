package se.test003;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println(c);
		
		System.out.println(c.size());
		
		boolean isEmpty = c.isEmpty();
		System.out.println(isEmpty);
		
		Collection c1 = new ArrayList();
		System.out.println(c1.isEmpty() );
		c1.clear();//Çå¿Õ¼¯ºÏ
	}

}
