package string;
/*
 * 9����Աע��
Ҫ��
���û������Ȳ�С��3
�����볤�Ȳ�С��6
��ע��ʱ�����������������ͬ 
 */
import java.util.Scanner;

public class Test09_VIP {

	public static void main(String[] args) {
		String name;//����û���
		String passwd1;//��ŵ�һ�����������
		String passwd2;//��ŵڶ������������
		while(true){
			//��ȡ¼����û���/����1/����2
		Scanner in=new Scanner(System.in);
		System.out.print("�������û�����");
		 name=in.next();
		System.out.println("���������룺");
		 passwd1=in.next();
		System.out.println("���ٴ��������룺");
		 passwd2=in.next();
		 //�ж��û��������볤��
		 if(name.length()<3 && passwd1.length()<6) {
			 System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6��");
			 continue;
		 //�ж���������������Ƿ�һ��
		 }else if(passwd1.equals(passwd2)==false) {
			 System.out.println("�����������벻��ͬ��");
			 continue;
		 }else {
		 //������ȷ�����
			 System.out.println("ע��ɹ������μ��û��������롣");
			 in.close();
			 return;
		 }
		}
	}
	
}
