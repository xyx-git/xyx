package string;
/*
 * �ַ���"#hh123@",�ж��Ƿ���"#"��ʼ��"@"��β�����ǣ��򽫸��ַ�����"hh123"��ȡ����
 */
public class Test05_begain_end {

	public static void main(String[] args) {
		String s1="#hh123@";
		String s2="";
		//�жϿ�ͷ�ͽ�β
		if(s1.startsWith("#")&&s1.endsWith("@")) {
		//tru������ȡ��ȥ��ʼ��βλ�õ������ַ���
		 s2=s1.substring(1, s1.length()-1);
		}
		//�ַ������Ȳ�Ϊ0������β����0
		while(s2.length()<10) {
			s2+="0";
		}
	}

}
