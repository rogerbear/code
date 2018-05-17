package se.test003;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		Date date = calendar.getTime();
		System.out.println(date);

		date.setTime(date.getTime() + 1000 * 60 * 60 * 24);//明天这个时候的时间
		System.out.println(date);
		
		calendar.setTime(date);//显示给定的date显示日期
	}

}
