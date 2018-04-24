package com.tarena.shoot;

import java.util.Random;

/** �л�:�Ƿ����Ҳ�ǵ��� */
public class Airplane extends FlyingObject implements Enemy {
	private int speed = 2; //�л��ƶ��Ĳ���
	
	/** ��ʼ��ʵ������ */
	public Airplane(){
		image = ShootGame.airplane;  //ͼƬ
		width = image.getWidth();  //��
		height = image.getHeight();  //��
		y = -height;    //y����
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - width);  //x����
	}
	/** ��д�߲� */
	public void step(){
		y += speed;
	}
	
	/** ��ȡ����5 */
	public int getScore(){
		return 5;
	}
}
