package test003;

public class Test {

	public static void main(String[] args) {
		int a = 5;

		/** 
		 * int b 相当于:5 + 6 + 7 = 18
		 * 执行完a++[运算]后a进行自增,不是执行完此条完整语句后a才自增,而且在同一条语句中a++以后的a都是自增以后的值
		 */
		int b = a++ + a++ + a;

		// a经过两次自增,所以它的值是7
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
