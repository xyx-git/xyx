package chapter9;

public class NullPointer {
 String [] name=new String[2];   //����һ��String��������
	public static void main(String[] args) {
		try {
			String [] name=new String[1];   //����һ������Ϊ1��String��������
			System.out.println(name[100]);	//����name��������ĵ�101��Ԫ�أ���101��Ԫ�ز����ڣ�����ֿ�ָ���쳣
		}catch(NullPointerException e) {	//��׽��ָ���쳣
			e.printStackTrace();			//����쳣��Ϣ
		}
	}
}
