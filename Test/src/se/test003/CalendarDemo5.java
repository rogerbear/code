package se.test003;

import java.util.Calendar;

public class CalendarDemo5 {

	public static void main(String[] args) {
		/*
		 *  �鿴3��2��1��������
		 */
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DAY_OF_YEAR, 15);	
		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.YEAR, -5);
		System.out.println(calendar.getTime());
	}

}
