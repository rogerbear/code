package se.test003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) throws ParseException {
		System.out.println("请输入生日：");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(str);
		Date now = new Date();
		long time = now.getTime() - birthday.getTime();
		time = time / 1000 / 60 / 60 / 24;
		System.out.println("恭喜你，到现在你活了" + time + "天！");

		time = 20000 - time;
		System.out.println("距离20000天还有" + time + "天！");

		time = time * 1000 * 60 * 60 * 24;
		now.setTime(now.getTime() + time);
		System.out.println("生存20000天的纪念日是：" + sdf.format(now));

	}

}
