package string;
/*
 * �ж�"123456789"�Ƿ��ǻ��ģ�����charAt������
 */
public class Test04_charAt {

	public static void main(String[] args) {
		String s1="123456789";
		for (int i=0;i<s1.length()/2;i++) {
			if(s1.charAt(i)!= s1.charAt(s1.length()-i-1)) {
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");
	}

}
