package test006;
import java.util.Random;
import java.util.Scanner;
//���ַ�
public class GuessingGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;  //��¼�´�Ĵ���
		char[] chs = generate(); //����5���ַ�
		for(int i=0;i<chs.length;i++){
			System.out.print(chs[i]);
		}
		System.out.println();
		while(true){  //������ѭ��
			System.out.println("�°�!");
			String str = scan.next().toUpperCase();//�����û��Ĵ�
			if("EXIT".equals(str)){//�ж��ַ�����ȵķ���
				System.out.println("�´�����");
				break;
			}
			char[] input = str.toCharArray();//����תΪ����
			int[] result = check(chs,input);//�Ա�
			if(result[1]==chs.length){
				int score = chs.length*100-count*10;
				System.out.println("��ϲ�㣬�¶��ˣ��÷�"+score);
				break;  //����ѭ��
			}else{
				count++; //�´�һ�μ�1
				System.out.println("�ַ�����"+result[0]+"����λ�ö���"+result[1]+"��");
			}
			
		}
	}
	
	//�������5���ַ�����
	public static char[] generate(){
		char[] chs = new char[5];
		Random rand = new Random();
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean[] flags = new boolean[letters.length];
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index = rand.nextInt(letters.length);
			}while(flags[index]);
			chs[i] = letters[index];
			flags[index] = true;
		}
		return chs;
	}
	//�Ƚ�
	public static int[] check(char[] chs,char[] input){
  	int[] result = new int[2];
  	for(int i=0;i<chs.length;i++){
  		for(int j=0;j<input.length;j++){
  			if(chs[i]==input[j]){
  				result[0]++; //�ַ�����1
  				if(i==j){
  					result[1]++; //λ�ö���1
  				}
  				break;
  			}
  		}
  	}
  	return result;
  }
}





