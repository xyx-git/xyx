package string;
/*
 * 有一个字符串 qwertyy123df    dsgfag，请问如何判断这个字符串中包含123？
 */
public class Test01_indexof {

	public static void main(String[] args) {
		String s1=" qwertyy123df    dsgfag";
		String s2="123";
		if (s1.indexOf(s2)==-1) {
			System.out.println("字符串"+s1+"包含字符串"+s2);
		}else{
			System.out.println("字符串"+s1+"不包含字符串"+s2);
		}
	}

}
