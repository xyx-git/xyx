package chapter8_area;
/*
 * �������ֱ�����������
 */
public class Triangle extends Area {

	
	public double area(double pr) {
		double area=(Math.pow(pr/(2+1.414), 2))/2;
//		 System.out.println("�ܳ�Ϊ"+pr+"�ĵ���ֱ�����������Ϊ��"+area);
		 return area;
	}

}
