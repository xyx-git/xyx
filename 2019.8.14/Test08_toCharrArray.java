package string;

import java.util.Scanner;
/*8���Զ���һ���ַ������û�����¼��һ���ַ���
 * �жϸ��ַ��Ƿ����Զ�����ַ����У�ʹ��toCharArray������*/
public class Test08_toCharrArray {

	public static void main(String[] args) {
		String s1="123567768563443dfgfdgdfgfd ";
		//���ַ���ת��char����
		char [] c1=s1.toCharArray();
		//¼��һ���ַ�
		Scanner in=new Scanner(System.in);
		//ת��char���飬Ȼ����ȡ��0λ�õ��ַ�
		char c2=in.next().toCharArray()[0];
		//����ȡ�������ַ����ַ����е�ÿһ���ַ��Ƚ�
		for(int i=0;i<s1.length();i++) {
			if(c1[i]==c2) {
				System.out.println("���ַ����ַ�����");
				return;
			}
		}
		System.out.println("���ַ������ַ�����");
	}

}
