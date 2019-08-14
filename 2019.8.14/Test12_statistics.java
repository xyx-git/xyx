package string;
/*
 * 键盘录入一个字符串，
 * 统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数,
 * 其他字符出现的次数。
 */
import java.util.Scanner;

public class Test12_statistics {

	public static void main(String[] args) {
		//生成数字、小写字母、大写字母  char数组
		char[] num= {'1','2','3','4','5','6','7','8','9','0'};
		String s1= "qwertyuiopasdfghjklzxcvbnm";
		String s2= "QWERTYUIOPASDFGHJKLZXCVBNM";
		char []a_z=s1.toCharArray();
		char []A_Z=s2.toCharArray();
		//录入字符串
		Scanner in=new Scanner(System.in);
		System.out.println("录入字符串：");
		String s3=in.next();
		//将录入的字符串转成char数组
		char[] c3=s3.toCharArray();
		
		//将录入的字符串里面的字符拿出来和数字、小写字母、大写字母 中一一对比
		int a=0;
		for(int i=0;i<s3.length();i++) {
			for (int k=0;k<num.length;k++) {
				if(c3[i]==num[k]) {
					a++;//匹配成功则加1
				}
			}
		}
		int b=0;
		for(int i=0;i<s3.length();i++) {
			for (int k=0;k<s1.length();k++) {
				if(c3[i]==a_z[k]) {
					b++;
				}
			}
		}
		int c=0;
		for(int i=0;i<s3.length();i++) {
			for (int k=0;k<s1.length();k++) {
				if(c3[i]==A_Z[k]) {
					c++;
				}
			}
		}
		 //输出结果
		System.out.println(s3+"中的大小字母有："+c+
				"个，小写字母有："+b+
				"个，数字字符有"+a+
				"个，其它字符"+(s3.length()-a-b-c)+"个");
		
		
	}

}
