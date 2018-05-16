package se.test002;

public class StringDemo3 {

	public static void main(String[] args) {
		String str = "sdljfg34k3k45k34h53453hjkjlj";

		String regex = "\\d+";
		String newStr = str.replaceAll(regex, "#NUMER#");
		System.out.println(newStr);
	}

}
