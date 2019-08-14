package string;
/*
 * 有一个字符串www.baidu.com 。请截取两个子字符串，分别为 baidu     com
 */
public class Test02_suString {

	public static void main(String[] args) {
		String s1="www.baidu.com ";
		String s2=s1.substring(4, 9);
		String s3=s1.substring(10);
	}

}
