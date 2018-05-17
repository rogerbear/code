package se.test003;

import java.util.Calendar;

public class CalendarDemo4 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);

		days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年共" + days + "天。");
	}

}
