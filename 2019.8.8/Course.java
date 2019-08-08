package chapter9_abnormal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Course {

	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入课程代号(1~3之间的数字)：\t");
	
		
		try {
			int	b=input.nextInt();
			switch (b){
			case 1:		
				System.out.println("C#编程");
				break;
			case 2:		
				System.out.println("Java编程");
				break;
			case 3:		
				System.out.println("SQL基础");
				break;
			}		
			}catch(InputMismatchException e) {//输入不为int类型时
				System.err.println("输入不为数字");
				e.printStackTrace();
			}catch(Exception e){//其它异常
				e.printStackTrace();
			}finally {		//不管是否捕捉到异常  都会执行
				input.close();//关闭键盘录入
				System.out.println("欢迎提出意见！");
			}
	}

	
	
	
}
