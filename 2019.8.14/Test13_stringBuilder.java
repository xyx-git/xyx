package string;
/*
 * 12����һ���ַ�����0����ѭ��ʮ�Ρ�(ʹ��stringBuilder�������δ�������)
��һ�Σ���01��
�ڶ���: ��012��
�����Σ���0123��
��������������
��ʮ�Σ���012345678910��
ע��������ս�����ַ���
 */
public class Test13_stringBuilder {

	public static void main(String[] args) {
		//����StringBuilder����
		StringBuilder s=new StringBuilder("0");
		//ѭ��10�Σ�ÿ�μ� i
		for(int i=1;i<=10;i++) {
			s.append(i);
		}
		//תΪString���ͣ�Ȼ�����
		System.out.println(s.toString());
	}

}
