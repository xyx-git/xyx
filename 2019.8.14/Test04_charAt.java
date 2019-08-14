package string;
/*
 * 判断"123456789"是否是回文（利用charAt方法）
 */
public class Test04_charAt {

	public static void main(String[] args) {
		String s1="123456789";
		for (int i=0;i<s1.length()/2;i++) {
			if(s1.charAt(i)!= s1.charAt(s1.length()-i-1)) {
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");
	}

}
