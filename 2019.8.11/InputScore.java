package chapter9;

import java.util.InputMismatchException;
import java.util.Scanner;

//�����쳣��,�̳�RuntimeExpection
class wrongScore extends RuntimeException{
	//��д���췽��
	public wrongScore (String message) {
		super(message);
	}
}
public class InputScore {
	public static double SetScore(double a) throws wrongScore{
		if (a>=0 && a<=100) {
			return a;
		}else {
			throw new wrongScore("����ĳɼ�������0~100֮�������");
		}		
	}
	
	public static void main(String[] args) {
		System.out.print("��������Ҫ¼��ĳɼ�:  ");
		while(true) {
			Scanner in=new Scanner(System.in);
			try {
				System.out.println("¼��ɹ�����¼��ķ����ǣ�"+SetScore(in.nextDouble()));
			}catch (InputMismatchException e) {
				System.err.print("ֻ���������֣�����ȷ������Ϣ��");
				continue;
			}catch(wrongScore e){
				e.getMessage();
				System.err.print("������0~100֮������֣�����ȷ������Ϣ��");
				continue;
			}
				in.close();
				break;
		}
	}
}
