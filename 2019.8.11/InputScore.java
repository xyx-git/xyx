package chapter9;

import java.util.InputMismatchException;
import java.util.Scanner;

//定义异常类,继承RuntimeExpection
class wrongScore extends RuntimeException{
	//重写构造方法
	public wrongScore (String message) {
		super(message);
	}
}
public class InputScore {
	public static double SetScore(double a) throws wrongScore{
		if (a>=0 && a<=100) {
			return a;
		}else {
			throw new wrongScore("输入的成绩必须是0~100之间的数！");
		}		
	}
	
	public static void main(String[] args) {
		System.out.print("请输入需要录入的成绩:  ");
		while(true) {
			Scanner in=new Scanner(System.in);
			try {
				System.out.println("录入成功！您录入的分数是："+SetScore(in.nextDouble()));
			}catch (InputMismatchException e) {
				System.err.print("只能输入数字，请正确输入信息：");
				continue;
			}catch(wrongScore e){
				e.getMessage();
				System.err.print("必须是0~100之间的数字，请正确输入信息：");
				continue;
			}
				in.close();
				break;
		}
	}
}
