package se.test002;

public class Test03 {

	public static void main(String[] args) {
		String regex = "(wqnmlgb|sb|djb|cnm)";
		
		String message = "wqnmlgb你这个djb，真是cnm，你个sb！";
		
		message = message.replaceAll(regex, "***");
		System.out.println(message);
	}

}
