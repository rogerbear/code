package se.test002;

public class Test01 {

	/*
	 * 验证手机号的正则表达式
	 * 完整的形式：(\+86|0086)?\s*1[0-9]{10}
	 */
	public static void main(String[] args) {
		String regex = "1[0-9]{10}";
		String num = "12389893243";
		boolean flag = num.matches(regex);
		if(flag) {
			System.out.println("is phone num");
		}else {
			System.out.println("not a phone num");
		}
	}

}
