package mark2;
/*
 * �ڰ�mark2�д�����Stest��main�����в��ԡ�
 * ��ʵ����S��ǰ����static�鱻����һ�Ρ�
 * ����S���е�weight ���ܷ��޸�????
 * ����S���е�size���ܷ��޸�????
 */
public class Stest {
	public static void main(String[] args) {
		S s=new S();
//		s.weight=20;   �����޸ģ���Ϊweight��final���Σ�ֻ�ܱ���ֵһ��
		S.size="S";  //�����޸ģ���Ϊstatic���εı����������κζ��󣬿���ֱ��ʹ������+.  ����
		s.size="M";  //Ҳ�����ö�����+.  ����
	}
}
