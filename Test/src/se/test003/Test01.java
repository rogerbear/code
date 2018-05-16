package se.test003;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * 显示当前时间与计算16天5小时23份40秒后的时间
		 */

		Date date = new Date();

		long time = date.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(date);
		time += 1000 * 60 * 60 * 24 * 16;
		time += 1000 * 60 * 60 * 5;
		time += 1000 * 60 * 23;
		time += 1000 * 40;
		date.setTime(time);
		System.out.println(sdf.format(date));
	}

}
