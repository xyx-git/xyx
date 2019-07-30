package day07_Rect;
/*
 * 写一个矩形类Rect，包含：
 * 两个属性：矩形的宽width；矩形的高height。
 * 两个构造方法：
 * 1．一个带有两个参数的构造方法，用于将width和height属性初化；
 * 2．一个不带参数的构造方法，将矩形初始化为宽和高都为10。
 * 两个方法：
 * 求矩形面积的方法area()
 * 求矩形周长的方法perimeter()
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


