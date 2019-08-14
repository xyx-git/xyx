package string;
/*
 * 10、判断.java文件名是否正确
 */
import java.util.Scanner;

public class Test10_java {

	public static void main(String[] args) {
		//录入文件名
		System.out.println("输入文件名：");
		Scanner in=new Scanner(System.in);
		String name=in.next();
		//将录入的文件名最后4未提取出来与.java比较
		if(".java".equals(name.substring(name.length()-5))) {
			System.out.println("文件名正确");
		}else {
			System.out.println("文件名错误");
		}
	}

}
