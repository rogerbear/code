package com.tarena.shoot;
import java.awt.image.BufferedImage;
/** �������� */
public abstract class FlyingObject {
	protected int width;  //��
	protected int height; //��
	protected int x;      //x����
	protected int y;      //y����
	protected BufferedImage image; //ͼƬ
	
	/** �߲� */
	public abstract void step();
}





