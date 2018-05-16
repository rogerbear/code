package se.test001;

public class SringDemo2 {

	public static void main(String[] args) {
		String str = "Thinking in java";
		int index = str.indexOf("in");
		System.out.println(index);
		
		index = str.indexOf("in",3);
		System.out.println(index);
		
		index = str.lastIndexOf("in");
		System.out.println(index);
	}

}
