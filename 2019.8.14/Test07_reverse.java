package string;
/*
 * 7、利用StringBuilder的反转方法，
 * 判断给定的字符串是否为回文(字符串自定义)
 */
public class Test07_reverse {

	public static void main(String[] args) {
		//自定义字符串
		String s1="12345687gfthdf";
		//转StringBuilder类型
		StringBuilder s2=new StringBuilder(s1);
		//将反转，然后转成String类型
		String s3=s2.reverse().toString();
		//对比字符串反转前后是否相等
		if (s2.equals(s3)) {
				System.out.println("是回文");
			}else {
				System.out.println("不是回文");
			}
	}
}
