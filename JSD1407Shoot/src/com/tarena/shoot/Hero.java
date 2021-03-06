package com.tarena.shoot;
import java.awt.image.BufferedImage;
/** 英雄机类:是飞行物 */
public class Hero extends FlyingObject {
	private BufferedImage[] images = {}; //两张图片
	private int index; //图片交换计数
	private int doubleFire;  //双倍火力
	private int life;   //命
	
	/** 初始化实例变量 */
	public Hero(){
		image = ShootGame.hero0;  //图片
		width = image.getWidth(); //宽
		height = image.getHeight();  //高
		x = 150;  //x坐标
		y = 400;  //y坐标
		doubleFire = 0;  //单倍火力
		life = 3;  //命3条
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};
	}

	/** 重写走步 */
	public void step(){ //切图片
		//step()方法被调用10次，换一次图片
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




