package chapter9;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;

//�Զ����쳣��
class mistakeR extends RuntimeException {
	public mistakeR(String message) {
		super(message);
	}
}

public class Test03_circle {
	double r;
	// ���ð뾶�����뾶С��0ʱ�׳�mistakeR�쳣
	public void setR(double k) throws mistakeR {
		if (k >= 0) {
			this.r = k;
		} else {
			throw new mistakeR("�뾶����С��0��");
		}
	}
	// ����
	public static void main(String[] args) throws Exception {
		Test03_circle t = new Test03_circle();//ʵ����
		
		while (true) {// ����һ����ѭ�������������ݲ�����Ҫ��ʱ ����ѭ�����������Ҫ����break���������� ���ܳ�
			Scanner in = new Scanner(System.in);
			System.out.println("������Բ�İ뾶��");
			try {
				double k = in.nextDouble();
				t.setR(k);//�����ܳ�
				// ������û���쳣������ܳ��������   �ر����벢����ѭ��
				System.out.println("�ð뾶��Բ���ܳ��� ��" + t.r * 2 * Math.PI + "\n" + "�ð뾶��Բ������� ��" + t.r * t.r * Math.PI);
				in.close();
				break;     
			} catch (InputMismatchException e) {// �������ݲ���double����ʱ����������
				System.err.println("��������������С����");
				continue;						//�����������������ѭ��
			} catch (mistakeR e) { // ����ֵС��0 ʱ ,��������
				System.err.println("�����������0������");
				continue;
			}
		}
	}
}
