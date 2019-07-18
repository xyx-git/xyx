package day05_practice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 根据三角形的三条边长判断是直角三角形？钝角三角形？锐角三角形？可以循环输入
 */
public class Test03_triangle {
   static  double [] arr=new double [3];   //建立一个长度为3的数组
   static  boolean judge=false;	
   
   Scanner input=new Scanner(System.in);
   //录入三条边长，并装入arr数组
   public double[] input() {    	
    	 System.out.println("请输入第一条边：");
    	 arr[0]=input.nextDouble();
    	 System.out.println("请输入第二条边：");
    	 arr[1]=input.nextDouble();
    	 System.out.println("请输入第三条边：");
    	 arr[2]=input.nextDouble();
    	 Arrays.sort(arr);                   //将arr数组按从小到大排序
    	 return arr;                         //得到排序完后的arr
     }
   //判断三角形类型
   public void isTriangle(double [] a) {	     
	  if(arr[0]+arr[1]>arr[2]) {            //能构成三角形
	      if(arr[0]==arr[1] && arr[1]==arr[2]) {
		      System.out.println("这是一个等边三角形！");
	      }else if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]) {
	    	  System.out.println("这是一个直角三角形！");
	      }else if(arr[0]*arr[0]+arr[1]*arr[1]>arr[2]*arr[2]) {
	    	  System.out.println("这是一个锐角三角形！");
	      }else {
	    	  System.out.println("这是一个钝角三角形！");
	      }
	  }else {                               //不能构成三角形
		  System.out.println("这不能构成三角形!");
	  }	 
   }
   //是否继续输入
   public void lo() {	   
	   do {
		   this.input();
		   this.isTriangle(arr);
		   System.out.println("继续吗?(y/n):");
		 if("y".equals(input.next())){
			this.judge=true;   
		 }else {
			 this.judge=false;  
			 System.out.println("谢谢使用!");
		   }		   
	   }while(this.judge==true);
   }
   //打印结果
  public static void main(String[] args) {
	  Test03_triangle triangle=new Test03_triangle();
	   triangle.lo();
  }
}
