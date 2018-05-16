package se.test001;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		String str = "努力学习java!";
		StringBuilder builder = new StringBuilder(str);

		/*
		 * 还原为string
		 */
		str = builder.toString();

		builder.append("为了赚钱");
		System.out.println(builder);
		
		builder.replace(9, 13, "为了改变世界");
		System.out.println(builder);
		
		builder.delete(0, 4);
		System.out.println(builder);
		
		builder.insert(0, "精通");
		System.out.println(builder);
		
		builder.reverse();
		System.out.println(builder);
	}

}
