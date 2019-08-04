package chapter8_area;
/*
 * 计算等腰直角三角形面积
 */
public class Triangle extends Area {

	
	public double area(double pr) {
		double area=(Math.pow(pr/(2+1.414), 2))/2;
//		 System.out.println("周长为"+pr+"的等腰直角三角形面积为："+area);
		 return area;
	}

}
