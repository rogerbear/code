package se.test002;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "jksahdfjkh3r3489uerfjkjge00k";

		String regex = "[0-9]+";
		String[] array = str.split(regex);
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
