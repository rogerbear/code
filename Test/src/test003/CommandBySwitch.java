package test003;

import java.util.Scanner;

public class CommandBySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ѡ���ܣ�1.�鿴ȫ�� 2.�鿴��¼��¼ 0.�˳�");
		int num = scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("�鿴ȫ��");
			break;
		case 2:
			System.out.println("�鿴��¼��¼");
			break;
		case 0:
			System.out.println("��ӭ�´�����");
			break;
		default:
			System.out.println("��������");
		}
	}

}
