package day07_Rect;
/*
 * дһ��������Rect��������
 * �������ԣ����εĿ�width�����εĸ�height��
 * �������췽����
 * 1��һ���������������Ĺ��췽�������ڽ�width��height���Գ�����
 * 2��һ�����������Ĺ��췽���������γ�ʼ��Ϊ��͸߶�Ϊ10��
 * ����������
 * ���������ķ���area()
 * ������ܳ��ķ���perimeter()
 * 
 */
public class Rect {
	double width;
	double height;
	
	
	public Rect() {
		width=10;
		height=10;
	}
	public Rect(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public double area() {
		
		double area=width*height;
		return area;
	}
	
	public double perimeter() {
		
		double perimeter=(width+height)*2;
		return perimeter;
	}
	
}


