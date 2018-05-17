package se.test003;

import java.util.Calendar;

public class CalendarDemo3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println(month);

		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;// 1代表星期日，所以减1
		System.out.println(dayOfWeek);

		/*
		 * 今天为止已经过了多少天?
		 */
		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今年已经过了：" + dayOfYear + "天。");

	}

}
