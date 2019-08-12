package chapter9;

public class NullPointer {
 String [] name=new String[2];   //创建一个String类型数组
	public static void main(String[] args) {
		try {
			String [] name=new String[1];   //创建一个长度为1的String类型数组
			System.out.println(name[100]);	//访问name数组里面的第101个元素，第101个元素不存在，会出现空指针异常
		}catch(NullPointerException e) {	//捕捉空指针异常
			e.printStackTrace();			//输出异常信息
		}
	}
}
