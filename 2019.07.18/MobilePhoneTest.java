package day05_practice;

public class MobilePhoneTest{
	public static void main(String[] args) {
		MobilePhone mp=new MobilePhone();       //MobilePhone�౻public���Σ���ͬһ���п���ʹ�ã����õ���
		mp.brand="ƻ��";                         //brand��MobilePhone���еĳ�Ա����������public���Σ�������ͬһ���з��ʡ��޸ģ��˳�����ƻ������ֵ��brand
		String detail=mp.buy("��������");         //buy()ʹ��public���Σ�����ʹ�������ӡ���������
		System.out.println(detail);
	}
}
