package se.test003;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		/*
		 * 2018-05-16 19:36:09 yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String str = sdf.format(now);
		System.out.println(str);
	}

}
