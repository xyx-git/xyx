package string;
/*
 * ��һ���ַ��� qwertyy123df    dsgfag����������ж�����ַ����а���123��
 */
public class Test01_indexof {

	public static void main(String[] args) {
		String s1=" qwertyy123df    dsgfag";
		String s2="123";
		if (s1.indexOf(s2)==-1) {
			System.out.println("�ַ���"+s1+"�����ַ���"+s2);
		}else{
			System.out.println("�ַ���"+s1+"�������ַ���"+s2);
		}
	}

}
