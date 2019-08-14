package string;
/*
 * 11、系统随机了四个长度的验证码(由数字，大写字母，小写字母组成)。
用户在控制台输入验证码，对比与系统的验证码是否一致(不区分大小写)
 */
import java.util.Arrays;
import java.util.Scanner;

public class Test11_equals {

	public static void main(String[] args) {
		//生成验证码库，装入char数组
		String s="1234567890"
				+ "qwertyuiopasdfghjklzxcvbnm"
				+ "QWERTYUIOPASDFGHJKLZXCVBNM";
		char [] c=s.toCharArray();
		//通过随机的下标达到随机生成验证码的效果
		int a1=(int)(Math.random()*62);
		int a2=(int)(Math.random()*62);
		int a3=(int)(Math.random()*62);
		int a4=(int)(Math.random()*62);
		//生成随机字符，装入字符数组，然后转换成String类型
		char [] c2= {c[a1],c[a2],c[a3],c[a4]};
		String s2=String.valueOf(c2);
		System.out.println("验证码是： "+s2);
		
		//键盘录入验证码
		Scanner in=new Scanner(System.in);
		System.out.println("请输入四位长度的验证码！");
		String s3=in.next();
		//对比验证码，忽略大小写
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("验证通过！");
		}else {
			System.out.println("验证不通过！");
		}
		
	}

}
