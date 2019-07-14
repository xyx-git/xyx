package day02_practic;

import java.util.Scanner;

/*
 * 1、键盘录入学员姓名与学分。
 * 录入完毕后，管理系统能自动修改学员成绩,
 * 少于60的提高2分。也能输出所以的学员成绩。
 * 
 */
public class test01_Student {
     //建立学生类
  static String [] name=new String[99999999];//姓名
  static double [] score=new double[99999999];//学分
	//录入
	public static void entry() {
		Scanner input=new Scanner(System.in);
		boolean judge=true;
		int i;
		//录入学生姓名和分数
		for(i=0;;i++) {
			System.out.print("请输入学生姓名：");
			name [i]=input.next();
			System.out.print("请输入学生学分：");
			score [i]=input.nextInt();
		 //判断是否继续录入	
			System.out.println("是否继续输入？（y/n)");
			String in=input.next();
			if ("y".equals(in)) {
				judge=true;
			}else {
				judge=false;
				break;
			}
		}
	}
	
	public static void add() {
		boolean no=true;
		int k;
		for (k=0;;k++) {
			if(score[k]<60 && name[k]!=null) {
				score[k]=score[k]+2;
			}
			if(name[k]!=null) {
				no=true;
			}else if (name[k]==null) {
				no=false;
				break;
			}
		}
	}
	
	public static void output() {
		System.out.println("所有学生的成绩如下：");
		for(int j=0;j<=99999999;j++) {
			if(name[j]!=null) {
			System.out.println("姓名："+name[j]+"\t"+"学分："+score[j]+"\n");
			}	else {
				break;
			}
		}
	}
	public static void main(String[] args) {
		entry();
		add();
		output();
	}
	
	
}
