package chapter8_area;
/*
 * 定义一个Area抽象类，包含计算面积的抽象方法
 */
public abstract class Area {
	static final  double PI=3.14;//定义常量PI=3.14，
	
	public abstract double area(double pr);//定义抽象方法，传入周长参数
}
