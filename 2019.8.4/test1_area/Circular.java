package chapter8_area;
/*
 * ����Բ�������С
 */
public class Circular extends Area{

	public double area(double pr) {
		 double area=Math.pow(pr/PI/2, 2)*PI;
//		 System.out.println("�ܳ�Ϊ"+pr+"��Բ�����Ϊ��"+area);
		 return area;
	}

}
