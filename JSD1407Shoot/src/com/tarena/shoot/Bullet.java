package com.tarena.shoot;
/** �ӵ���:�Ƿ����� */
public class Bullet extends FlyingObject {
	private int speed = 3; //�ƶ��߲�
	
	/** ��ʼ��ʵ������ */
	public Bullet(int x,int y){
		image = ShootGame.bullet;  //ͼƬ
		width = image.getWidth();  //��
		height = image.getHeight();//��
		this.x = x;  //x����
		this.y = y;  //y����
	}

	/** ��д�߲� */
	public void step(){
		y -= speed;
	}
}





