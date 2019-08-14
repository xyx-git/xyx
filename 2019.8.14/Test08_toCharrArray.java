package string;

import java.util.Scanner;
/*8、自定义一个字符串。用户键盘录入一个字符。
 * 判断该字符是否在自定义的字符串中（使用toCharArray方法）*/
public class Test08_toCharrArray {

	public static void main(String[] args) {
		String s1="123567768563443dfgfdgdfgfd ";
		//将字符串转成char数组
		char [] c1=s1.toCharArray();
		//录入一个字符
		Scanner in=new Scanner(System.in);
		//转成char数组，然后提取出0位置的字符
		char c2=in.next().toCharArray()[0];
		//将提取出来的字符与字符串中的每一个字符比较
		for(int i=0;i<s1.length();i++) {
			if(c1[i]==c2) {
				System.out.println("该字符在字符串中");
				return;
			}
		}
		System.out.println("该字符不在字符串中");
	}

}
