package string;
/*
 * ����¼��һ���ַ�����
 * ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���,
 * �����ַ����ֵĴ�����
 */
import java.util.Scanner;

public class Test12_statistics {

	public static void main(String[] args) {
		//�������֡�Сд��ĸ����д��ĸ  char����
		char[] num= {'1','2','3','4','5','6','7','8','9','0'};
		String s1= "qwertyuiopasdfghjklzxcvbnm";
		String s2= "QWERTYUIOPASDFGHJKLZXCVBNM";
		char []a_z=s1.toCharArray();
		char []A_Z=s2.toCharArray();
		//¼���ַ���
		Scanner in=new Scanner(System.in);
		System.out.println("¼���ַ�����");
		String s3=in.next();
		//��¼����ַ���ת��char����
		char[] c3=s3.toCharArray();
		
		//��¼����ַ���������ַ��ó��������֡�Сд��ĸ����д��ĸ ��һһ�Ա�
		int a=0;
		for(int i=0;i<s3.length();i++) {
			for (int k=0;k<num.length;k++) {
				if(c3[i]==num[k]) {
					a++;//ƥ��ɹ����1
				}
			}
		}
		int b=0;
		for(int i=0;i<s3.length();i++) {
			for (int k=0;k<s1.length();k++) {
				if(c3[i]==a_z[k]) {
					b++;
				}
			}
		}
		int c=0;
		for(int i=0;i<s3.length();i++) {
			for (int k=0;k<s1.length();k++) {
				if(c3[i]==A_Z[k]) {
					c++;
				}
			}
		}
		 //������
		System.out.println(s3+"�еĴ�С��ĸ�У�"+c+
				"����Сд��ĸ�У�"+b+
				"���������ַ���"+a+
				"���������ַ�"+(s3.length()-a-b-c)+"��");
		
		
	}

}
