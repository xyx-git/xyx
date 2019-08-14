package string;
/*
 * 有字符串"  baidu  ",将这个字符串拼接成www.baidu.com
 */
public class Test03_contact {

	public static void main(String[] args) {
		String s1="baidu";
		String s2="www."+s1+".com";
		//或
		String s3="www.".concat(s1).concat(".com");
	}

}
