package se.test003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) throws ParseException {
		System.out.println("���������գ�");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(str);
		Date now = new Date();
		long time = now.getTime() - birthday.getTime();
		time = time / 1000 / 60 / 60 / 24;
		System.out.println("��ϲ�㣬�����������" + time + "�죡");

		time = 20000 - time;
		System.out.println("����20000�컹��" + time + "�죡");

		time = time * 1000 * 60 * 60 * 24;
		now.setTime(now.getTime() + time);
		System.out.println("����20000��ļ������ǣ�" + sdf.format(now));

	}

}
