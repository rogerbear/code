package test004;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("�°�!");
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guessing;	
		//ѭ����Ҫ�أ�
		//1.ѭ��������ʼ�� int num��
		//2.ѭ����������ѭ������Ϊ������num<10��
		//3.ѭ�������ĸı䣨��ѭ�����������ı䣩 num++
		
		do {//��һ����Ҫ����ͬʱ��ѡdo while
			System.out.println("�°�");
			guessing = scan.nextInt();//��һ����Ҫ����ͬ
			if(guessing == 0) {
				break;
			}
			if(guessing > num) {//�ڶ�Ҫ��
				System.out.println("̫����");
			}else if(guessing < num){
				System.out.println("̫С��");
			}
		}while(guessing != num);
		
		if(guessing == num) {
			System.out.println("��ϲ��¶���");
		}else {
			System.out.println("�´�����");
		}
		
		/*
		while(guessing != num) {
			if(guessing == 0) {
				break;
			}
			if(guessing > num) {
				System.out.println("̫����");
			}else {
				System.out.println("̫С��");
			}
			System.out.println("������");
			guessing = scan.nextInt();
		}
		if(guessing == num) {
			System.out.println("��ϲ��¶���");
		}else {
			System.out.println("�´�����");
		}
		*/
	}

}
