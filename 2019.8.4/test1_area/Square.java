package chapter8_area;
/*
 * �������������
 */
public class Square extends Area {


	public double area(double pr) {
		double area=Math.pow(pr/4, 2);
//		 System.out.println("�ܳ�Ϊ"+pr+"�����������Ϊ��"+area);
		 return area;
	}

}
