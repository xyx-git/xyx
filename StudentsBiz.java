package day01_practic;

import java.util.Scanner;

/*
 * 9����һ��ѧ����Ϣ������StudentsBiz
 * ���Ա���30��ѧ�������б�
 * ������������ѧ��������
 * ��������ʾ�����ѧ�������б�
 * ��������һ���������ѧ��������
 */
public class StudentsBiz {
	private static char[] na;
	String name;
   public static void main(String[] args) {
	   StudentsBiz [] stu=new StudentsBiz[30];
	   Scanner input=new Scanner(System.in);
	   
	   
	   int i=0;
	   
	   do {
		   
	   System.out.print("������ѧ��������");
	   String na=input.next();
	   stu[i].name=na;
	   
	   }while (i<30);
	   System.out.println("����ѧ���б�");
	     for (int k=0;k<stu.length;k++) {
	    	 System.out.println(stu[k].na);
	     }
}
}
