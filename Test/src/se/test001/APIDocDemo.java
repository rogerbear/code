package se.test001;

/**
 * �ĵ�ע�� �ĵ�ע�Ϳ��Զ��࣬�����������Ƚ������� 
 * ���Ա�javadoc���������ͣ�Ȼ������һ���ĵ��ֲ� ��ǰ�����������ĵ�ע�͵�ʹ�ù淶
 * 
 * @author roger
 * @version 1.0 08/05/16
 * @see java.lang.String
 * @since JDK1.8
 * 
 */
public class APIDocDemo {
	/**
	 * sayHello�������õ����ʺ���
	 */
	public static final String INFO = "��ã�";
	/**
	 * Ϊָ���û�����ʺ���
	 * @param name ָ���û�����
	 * @return ����ʺ������ַ���
	 */
	public static String sayHello(String name) {
		return INFO + name;
	}
}
