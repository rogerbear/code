package test003;

import java.util.Scanner;

public class CommandBySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择功能：1.查看全部 2.查看登录记录 0.退出");
		int num = scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("查看全部");
			break;
		case 2:
			System.out.println("查看登录记录");
			break;
		case 0:
			System.out.println("欢迎下次再来");
			break;
		default:
			System.out.println("输入有误");
		}
	}

}
