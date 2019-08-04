package chapter8_area;
/*
 * 计算圆形面积大小
 */
public class Circular extends Area{

	public double area(double pr) {
		 double area=Math.pow(pr/PI/2, 2)*PI;
//		 System.out.println("周长为"+pr+"的圆形面积为："+area);
		 return area;
	}

}
