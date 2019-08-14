package string;
/*
 * 字符串"#hh123@",判断是否以"#"开始，"@"结尾。如是，则将该字符串的"hh123"截取出来
 */
public class Test05_begain_end {

	public static void main(String[] args) {
		String s1="#hh123@";
		String s2="";
		//判断开头和结尾
		if(s1.startsWith("#")&&s1.endsWith("@")) {
		//tru，则提取除去开始结尾位置的其它字符串
		 s2=s1.substring(1, s1.length()-1);
		}
		//字符串长度不为0，则在尾部加0
		while(s2.length()<10) {
			s2+="0";
		}
	}

}
