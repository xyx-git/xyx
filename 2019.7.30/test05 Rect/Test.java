package day07_Rect;
/*
 * ��дPlainRect��Ĳ��Գ���
 * ����һ�����Ͻ�����Ϊ��10��10������Ϊ20����Ϊ10�ľ��ζ���
 * ���㲢��ӡ������ε�������ܳ���
 * �жϵ�(25.5��13)�Ƿ��ھ����ڣ�����ӡ��������Ϣ��
 */
public class Test {

	public static void main(String[] args) {

		PlainRect Plain=new  PlainRect(10,10,20,10);
		System.out.println("���ε� ����ǣ�"+Plain.area()+"\n"+"���ε��ܳ��ǣ�"+Plain.perimeter());
		if (Plain.isInside(25.5, 13)==false) {
			System.out.println("�ھ�����");
		}else {
			System.out.println("�ھ�����");
		}
		
	}
	
	
	
	
}
