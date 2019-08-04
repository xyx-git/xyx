package chapter8_area;
import java.util.Arrays;
public class Test {
	 double pr;//周长
	 double [] arr=new double [3];//定义长度为3的double型数组arr
	 
	 void maxAreaIs() {
		 	pr=50;//定义周长大小
	 		//向上转型	
			Area a1=new Circular();
			Area a2=new Square();
			Area a3=new Triangle();
			
			//将面积填入数组arr
			arr[1]=a1.area(pr);
			arr[0]=a2.area(pr);
			arr[2]=a3.area(pr);
			
			//将数组从小到大排序
			Arrays.sort(arr);
		
			//匹配arr[2]中的数值
			if (arr[2]==a1.area(pr)) {
				System.out.println("圆形的面积最大");
				
			}else if (arr[2]==a2.area(pr)) {
				System.out.println("正方形的面积最大");
			}else if (arr[2]==a3.area(pr)) {
				System.out.println("等腰直角三角形的面积最大");
			}
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.maxAreaIs();
	}
	
//	  void ismax() {
//	  //建立对象数组m
//	  Area [] m=new Area[3];
//	  //向上转型
//	  m[0]=new Circular();
//	  m[1]=new Square();
//	  m[2]=new Triangle();
//	  //赋值给数组arr；
//	  arr[0]=m[0].area(pr);
//	  arr[1]=m[1].area(pr);
//	  arr[2]=m[2].area(pr);	
//		//匹配数组最后一位
//		switch (arr[2]) {
//		case m[0].area(pr):
//			System.out.println("圆形的面积最大");
//			break;
//		case m[1].area(pr):
//			System.out.println("正方形的面积最大");
//			break;
//		case m[2].area(pr):
//			System.out.println("等腰直角三角形的面积最大");
//			break;
//		}	
//}
	

}
