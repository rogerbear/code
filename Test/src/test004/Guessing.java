package test004;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("猜吧!");
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guessing;	
		//循环三要素：
		//1.循环变量初始化 int num；
		//2.循环的条件（循环变量为基础）num<10；
		//3.循环变量的改变（向循环变量结束改变） num++
		
		do {//第一第三要素相同时首选do while
			System.out.println("猜吧");
			guessing = scan.nextInt();//第一第三要素相同
			if(guessing == 0) {
				break;
			}
			if(guessing > num) {//第二要素
				System.out.println("太大了");
			}else if(guessing < num){
				System.out.println("太小了");
			}
		}while(guessing != num);
		
		if(guessing == num) {
			System.out.println("恭喜你猜对了");
		}else {
			System.out.println("下次再来");
		}
		
		/*
		while(guessing != num) {
			if(guessing == 0) {
				break;
			}
			if(guessing > num) {
				System.out.println("太大了");
			}else {
				System.out.println("太小了");
			}
			System.out.println("继续猜");
			guessing = scan.nextInt();
		}
		if(guessing == num) {
			System.out.println("恭喜你猜对了");
		}else {
			System.out.println("下次再来");
		}
		*/
	}

}
