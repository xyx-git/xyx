package come.baidu.pay.test;

public class User_LM {
	static come.baidu.pay.market.User user=new come.baidu.pay.market.User();
	
	public static void main(String[] args) {
		user.setAccount(123456);
		user.setName("李明");
		user.setPassword(111111);
		user.setAdress("尖顶坡");
		
		System.out.println("用户名："+user.getAccount());
		System.out.println("姓名："+user.getName());
		System.out.println("密码："+user.getPassword());
		System.out.println("地址："+user.getAdress());
}
	/*
	 * 首先在堆中开辟  user空间
	 * 然后在栈中开辟一个栈帧，存放account,name,password,adress
	 * 然后调用user.set____()方法，它会在栈中开辟一个栈帧，里面存放user.set____的局部变量和参数
	 * user.set____()结束，对应的栈帧消失 
	 * 之后main方法结束，其对应的栈帧消失
	 */
}
