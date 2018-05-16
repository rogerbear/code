package se.test003;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		now.getYear();// 不建议使用了

		long time = now.getTime();
		System.out.println(time);

		time += 1000 * 60 * 60 * 24;
		now.setTime(time);
		System.out.println(now);
	}

}
