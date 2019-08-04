package chapter8_area;
/*
 * 计算正方形面积
 */
public class Square extends Area {


	public double area(double pr) {
		double area=Math.pow(pr/4, 2);
//		 System.out.println("周长为"+pr+"的正方形面积为："+area);
		 return area;
	}

}
