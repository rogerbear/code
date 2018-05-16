package se.test001;

import java.util.Scanner;

/**
 * 通过用户输入的网址获取网址中的域名
 * 
 * @author roger
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String host = scan.nextLine();
		int start = host.indexOf(".") + 1;
		System.out.println(start);
		int end = host.indexOf(".", start);
		String host_end = host.substring(start, end);
		System.out.println("域名是：" + host_end);
		scan.close();
		
	}

}
