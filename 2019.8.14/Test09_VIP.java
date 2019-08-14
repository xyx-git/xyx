package string;
/*
 * 9、会员注册
要求：
·用户名长度不小于3
·密码长度不小于6
·注册时两次输入密码必须相同 
 */
import java.util.Scanner;

public class Test09_VIP {

	public static void main(String[] args) {
		String name;//存放用户名
		String passwd1;//存放第一次输入的密码
		String passwd2;//存放第二次输入的密码
		while(true){
			//获取录入的用户名/密码1/密码2
		Scanner in=new Scanner(System.in);
		System.out.print("请输入用户名：");
		 name=in.next();
		System.out.println("请输入密码：");
		 passwd1=in.next();
		System.out.println("请再次输入密码：");
		 passwd2=in.next();
		 //判断用户名和密码长度
		 if(name.length()<3 && passwd1.length()<6) {
			 System.out.println("用户名长度不能小于3，密码长度不能小于6！");
			 continue;
		 //判断两次输入的密码是否不一致
		 }else if(passwd1.equals(passwd2)==false) {
			 System.out.println("两次密码输入不相同！");
			 continue;
		 }else {
		 //输入正确的情况
			 System.out.println("注册成功，请牢记用户名和密码。");
			 in.close();
			 return;
		 }
		}
	}
	
}
