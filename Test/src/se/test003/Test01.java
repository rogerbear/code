package se.test003;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * ��ʾ��ǰʱ�������16��5Сʱ23��40����ʱ��
		 */

		Date date = new Date();

		long time = date.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
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
