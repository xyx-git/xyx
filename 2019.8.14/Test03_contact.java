package string;
/*
 * ���ַ���"  baidu  ",������ַ���ƴ�ӳ�www.baidu.com
 */
public class Test03_contact {

	public static void main(String[] args) {
		String s1="baidu";
		String s2="www."+s1+".com";
		//��
		String s3="www.".concat(s1).concat(".com");
	}

}
