package se.test001;

public class StringDemo6 {

	public static void main(String[] args) {
		String str = "thinking in java ��";
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		boolean ends = str.endsWith("��");
		System.out.println(ends);
	}

}
