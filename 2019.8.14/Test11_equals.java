package string;
/*
 * 11��ϵͳ������ĸ����ȵ���֤��(�����֣���д��ĸ��Сд��ĸ���)��
�û��ڿ���̨������֤�룬�Ա���ϵͳ����֤���Ƿ�һ��(�����ִ�Сд)
 */
import java.util.Arrays;
import java.util.Scanner;

public class Test11_equals {

	public static void main(String[] args) {
		//������֤��⣬װ��char����
		String s="1234567890"
				+ "qwertyuiopasdfghjklzxcvbnm"
				+ "QWERTYUIOPASDFGHJKLZXCVBNM";
		char [] c=s.toCharArray();
		//ͨ��������±�ﵽ���������֤���Ч��
		int a1=(int)(Math.random()*62);
		int a2=(int)(Math.random()*62);
		int a3=(int)(Math.random()*62);
		int a4=(int)(Math.random()*62);
		//��������ַ���װ���ַ����飬Ȼ��ת����String����
		char [] c2= {c[a1],c[a2],c[a3],c[a4]};
		String s2=String.valueOf(c2);
		System.out.println("��֤���ǣ� "+s2);
		
		//����¼����֤��
		Scanner in=new Scanner(System.in);
		System.out.println("��������λ���ȵ���֤�룡");
		String s3=in.next();
		//�Ա���֤�룬���Դ�Сд
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("��֤ͨ����");
		}else {
			System.out.println("��֤��ͨ����");
		}
		
	}

}
