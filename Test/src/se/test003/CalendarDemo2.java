package se.test003;

import java.util.Calendar;

public class CalendarDemo2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MONTH, 8);//�·�����0��ʼ��һ�µ�
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		System.out.println(calendar.getTime());
		
	}

}
