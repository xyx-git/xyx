package string;
/*
 * 10���ж�.java�ļ����Ƿ���ȷ
 */
import java.util.Scanner;

public class Test10_java {

	public static void main(String[] args) {
		//¼���ļ���
		System.out.println("�����ļ�����");
		Scanner in=new Scanner(System.in);
		String name=in.next();
		//��¼����ļ������4δ��ȡ������.java�Ƚ�
		if(".java".equals(name.substring(name.length()-5))) {
			System.out.println("�ļ�����ȷ");
		}else {
			System.out.println("�ļ�������");
		}
	}

}
