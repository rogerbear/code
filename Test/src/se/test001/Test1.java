package se.test001;

import java.util.Scanner;

/**
 * ͨ���û��������ַ��ȡ��ַ�е�����
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
		System.out.println("�����ǣ�" + host_end);
		scan.close();
		
	}

}
