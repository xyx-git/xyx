package day01_practic;

import java.util.Scanner;

/*
 * 9、有一个学生信息管理类StudentsBiz
 * 可以保存30个学生姓名列表
 * 并有能力增加学生姓名；
 * 有能力显示本班的学生姓名列表；
 * 有能力在一定区间查找学生姓名。
 */
public class StudentsBiz {
	private static char[] na;
	String name;
   public static void main(String[] args) {
	   StudentsBiz [] stu=new StudentsBiz[30];
	   Scanner input=new Scanner(System.in);
	   
	   
	   int i=0;
	   
	   do {
		   
	   System.out.print("请输入学生姓名：");
	   String na=input.next();
	   stu[i].name=na;
	   
	   }while (i<30);
	   System.out.println("本班学生列表");
	     for (int k=0;k<stu.length;k++) {
	    	 System.out.println(stu[k].na);
	     }
}
}
