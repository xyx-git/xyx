package string;
/*
 * 7������StringBuilder�ķ�ת������
 * �жϸ������ַ����Ƿ�Ϊ����(�ַ����Զ���)
 */
public class Test07_reverse {

	public static void main(String[] args) {
		//�Զ����ַ���
		String s1="12345687gfthdf";
		//תStringBuilder����
		StringBuilder s2=new StringBuilder(s1);
		//����ת��Ȼ��ת��String����
		String s3=s2.reverse().toString();
		//�Ա��ַ�����תǰ���Ƿ����
		if (s2.equals(s3)) {
				System.out.println("�ǻ���");
			}else {
				System.out.println("���ǻ���");
			}
	}
}
