package day01_practic;

import java.util.Scanner;

/*
 * 7、根据不同的游客类的年龄，计算门票费用
 * 门票规则：
 *   1.10岁及以下，门票免费；
 *   2.10—60岁，门票全票；
 *   3.超过60岁，门票半价
 */
public class tickets {
   //将人定义为一类
	static String name;  //名字
    static int age;      //年龄

public static void main(String[] args) {
	//创建3个人
	Scanner input=new Scanner(System.in);
	tickets p1=new tickets();
	boolean judje=false;
	Object go;
	do {
	System.out.print("请输入姓名：");
	 tickets.name=input.next();
	System.out.print("请输入年龄：");
	tickets.age=input.nextInt();
	        //判断票价
	    if(tickets.age<18) {
	    	System.out.println("门票免费");
	    }else if(tickets.age>17 && tickets.age<60) {
	    	System.out.println("门票全价：20元");
	    }else {
	    	System.out.println("门票半价：10元");
	    }
	     System.out.println("是否继续（y/n）？");
	    String yes=input.next();
	        //输入y继续输入，n结束循环
	     if (yes.equals("y")) {
	    	 judje=true;
	     }else {
	    	 judje=false;
	    	 System.out.println("程序结束！");
	     }
	     
	}while(judje=true);
}
}