package chapter9_abnormal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Course {

	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("������γ̴���(1~3֮�������)��\t");
	
		
		try {
			int	b=input.nextInt();
			switch (b){
			case 1:		
				System.out.println("C#���");
				break;
			case 2:		
				System.out.println("Java���");
				break;
			case 3:		
				System.out.println("SQL����");
				break;
			}		
			}catch(InputMismatchException e) {//���벻Ϊint����ʱ
				System.err.println("���벻Ϊ����");
				e.printStackTrace();
			}catch(Exception e){//�����쳣
				e.printStackTrace();
			}finally {		//�����Ƿ�׽���쳣  ����ִ��
				input.close();//�رռ���¼��
				System.out.println("��ӭ��������");
			}
	}

	
	
	
}
