package com.tarena.shoot;
import java.awt.image.BufferedImage;
/** Ӣ�ۻ���:�Ƿ����� */
public class Hero extends FlyingObject {
	private BufferedImage[] images = {}; //����ͼƬ
	private int index; //ͼƬ��������
	private int doubleFire;  //˫������
	private int life;   //��
	
	/** ��ʼ��ʵ������ */
	public Hero(){
		image = ShootGame.hero0;  //ͼƬ
		width = image.getWidth(); //��
		height = image.getHeight();  //��
		x = 150;  //x����
		y = 400;  //y����
		doubleFire = 0;  //��������
		life = 3;  //��3��
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};
	}

	/** ��д�߲� */
	public void step(){ //��ͼƬ
		//step()����������10�Σ���һ��ͼƬ
		int num = index++/10%images.length;
		image = images[num];
		/*
		 * index=0   0/10=0%2   0
		 * index=1   1/10=0%2   0
		 * ...
		 * index=9   9/10=0%2   0
		 * index=10  10/10=1%2  1
		 * index=11  11/10=1%2  1
		 * ...
		 * index=19  19/10=1%2  1
		 * index=20  20/10=2%2  0
		 * index=21  21/10=2%2  0
		 */
		
		
		/*
		 * image=images[0]
		 * or
		 * image=images[1]
		 */
	}
}




