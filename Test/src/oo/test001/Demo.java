package oo.test001;

public class Demo {

	public static void main(String[] args) {
		Cell c1 = new Cell();
		Cell c2 = c1;
		c1.row = 2; 
		c2.row = 5;
		System.out.println(c2.row);
		
		Cell c3 = new Cell();
		c3 = null;
		System.out.println(c3.row);
		
		
		
		
	}

}
