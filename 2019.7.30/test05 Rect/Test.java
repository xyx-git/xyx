package day07_Rect;
/*
 * 编写PlainRect类的测试程序
 * 创建一个左上角坐标为（10，10），长为20，宽为10的矩形对象；
 * 计算并打印输出矩形的面积和周长；
 * 判断点(25.5，13)是否在矩形内，并打印输出相关信息。
 */
public class Test {

	public static void main(String[] args) {

		PlainRect Plain=new  PlainRect(10,10,20,10);
		System.out.println("矩形的 面积是："+Plain.area()+"\n"+"矩形的周长是："+Plain.perimeter());
		if (Plain.isInside(25.5, 13)==false) {
			System.out.println("在矩形外");
		}else {
			System.out.println("在矩形内");
		}
		
	}
	
	
	
	
}
