package day05_practice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ���������ε������߳��ж���ֱ�������Σ��۽������Σ���������Σ�����ѭ������
 */
public class Test03_triangle {
   static  double [] arr=new double [3];   //����һ������Ϊ3������
   static  boolean judge=false;	
   
   Scanner input=new Scanner(System.in);
   //¼�������߳�����װ��arr����
   public double[] input() {    	
    	 System.out.println("�������һ���ߣ�");
    	 arr[0]=input.nextDouble();
    	 System.out.println("������ڶ����ߣ�");
    	 arr[1]=input.nextDouble();
    	 System.out.println("������������ߣ�");
    	 arr[2]=input.nextDouble();
    	 Arrays.sort(arr);                   //��arr���鰴��С��������
    	 return arr;                         //�õ���������arr
     }
   //�ж�����������
   public void isTriangle(double [] a) {	     
	  if(arr[0]+arr[1]>arr[2]) {            //�ܹ���������
	      if(arr[0]==arr[1] && arr[1]==arr[2]) {
		      System.out.println("����һ���ȱ������Σ�");
	      }else if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]) {
	    	  System.out.println("����һ��ֱ�������Σ�");
	      }else if(arr[0]*arr[0]+arr[1]*arr[1]>arr[2]*arr[2]) {
	    	  System.out.println("����һ����������Σ�");
	      }else {
	    	  System.out.println("����һ���۽������Σ�");
	      }
	  }else {                               //���ܹ���������
		  System.out.println("�ⲻ�ܹ���������!");
	  }	 
   }
   //�Ƿ��������
   public void lo() {	   
	   do {
		   this.input();
		   this.isTriangle(arr);
		   System.out.println("������?(y/n):");
		 if("y".equals(input.next())){
			this.judge=true;   
		 }else {
			 this.judge=false;  
			 System.out.println("ллʹ��!");
		   }		   
	   }while(this.judge==true);
   }
   //��ӡ���
  public static void main(String[] args) {
	  Test03_triangle triangle=new Test03_triangle();
	   triangle.lo();
  }
}
