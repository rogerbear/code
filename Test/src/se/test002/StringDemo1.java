package se.test002;

public class StringDemo1 {

	public static void main(String[] args) {
		/*
		 * 电子邮箱的正则表达式 [0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\.[0-9a-zA-Z_]+)+
		 */

		String regex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]+(\\.[0-9a-zA-Z_]+)+";
		System.out.println(regex);
		
		String mail = "zgz234@hotmail.com.cn";
		boolean flag = mail.matches(regex);
		if(flag) {
			System.out.println("is mail");
		}else {
			System.out.println("not a mail");
		}
				
	}

}
