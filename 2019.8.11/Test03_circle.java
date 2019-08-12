package chapter9;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;

//自定义异常类
class mistakeR extends RuntimeException {
	public mistakeR(String message) {
		super(message);
	}
}

public class Test03_circle {
	double r;
	// 设置半径，当半径小于0时抛出mistakeR异常
	public void setR(double k) throws mistakeR {
		if (k >= 0) {
			this.r = k;
		} else {
			throw new mistakeR("半径不能小于0！");
		}
	}
	// 测试
	public static void main(String[] args) throws Exception {
		Test03_circle t = new Test03_circle();//实例化
		
		while (true) {// 定义一个死循环，当输入内容不满足要求时 无限循环，输入符合要求则break，并输出面积 、周长
			Scanner in = new Scanner(System.in);
			System.out.println("请输入圆的半径：");
			try {
				double k = in.nextDouble();
				t.setR(k);//设置周长
				// 输入结果没有异常则输出周长、面积，   关闭输入并结束循环
				System.out.println("该半径的圆的周长是 ：" + t.r * 2 * Math.PI + "\n" + "该半径的圆的面积是 ：" + t.r * t.r * Math.PI);
				in.close();
				break;     
			} catch (InputMismatchException e) {// 输入内容不是double类型时，重新输入
				System.err.println("必须输入整数或小数！");
				continue;						//输入错误则跳过本次循环
			} catch (mistakeR e) { // 输入值小于0 时 ,重新输入
				System.err.println("必须输入大于0的数！");
				continue;
			}
		}
	}
}
