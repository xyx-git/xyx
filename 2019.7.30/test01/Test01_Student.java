package day07_test;
/*
 * ����Student��
 * ����sex���ԣ�����protected����
 */
public class Test01_Student {
	protected String sex="��";

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static void main(String[] args) {
		Test01_Student s=new Test01_Student();
		System.out.println("�ڱ����з��ʽ����"+s.sex);
	}
}



