package mark2;
/*
 * �ڰ�mark2�´�����S���ܹ��̳���F��
 * �ڸ����ж����Ա������
 * isSex ��ֵΪ����ĳ���sex��
 * weight ��Ա������final���Ρ�
 * size��Ա������static���Ρ� 
 * �ڸ����ж���static�飬�������ʱ���������S������ˣ���
 */
import mark1.F;

public class S extends F {
	String sex=super.sex;
	final int weight=50;
	static String size;
	static {
		System.out.println("S�������");
	}
}
