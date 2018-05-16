package se.test001;

/**
 * 文档注释 文档注释可以对类，方法，常量等进行修饰 
 * 可以被javadoc命令所解释，然后生成一个文档手册 当前类用来测试文档注释的使用规范
 * 
 * @author roger
 * @version 1.0 08/05/16
 * @see java.lang.String
 * @since JDK1.8
 * 
 */
public class APIDocDemo {
	/**
	 * sayHello方法中用到的问候语
	 */
	public static final String INFO = "你好！";
	/**
	 * 为指定用户添加问候语
	 * @param name 指定用户名字
	 * @return 添加问候语后的字符串
	 */
	public static String sayHello(String name) {
		return INFO + name;
	}
}
