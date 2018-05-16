package se.test001;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		String str = "Ŭ��ѧϰjava!";
		StringBuilder builder = new StringBuilder(str);

		/*
		 * ��ԭΪstring
		 */
		str = builder.toString();

		builder.append("Ϊ��׬Ǯ");
		System.out.println(builder);
		
		builder.replace(9, 13, "Ϊ�˸ı�����");
		System.out.println(builder);
		
		builder.delete(0, 4);
		System.out.println(builder);
		
		builder.insert(0, "��ͨ");
		System.out.println(builder);
		
		builder.reverse();
		System.out.println(builder);
	}

}
