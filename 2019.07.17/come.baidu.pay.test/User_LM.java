package come.baidu.pay.test;

public class User_LM {
	static come.baidu.pay.market.User user=new come.baidu.pay.market.User();
	
	public static void main(String[] args) {
		user.setAccount(123456);
		user.setName("����");
		user.setPassword(111111);
		user.setAdress("�ⶥ��");
		
		System.out.println("�û�����"+user.getAccount());
		System.out.println("������"+user.getName());
		System.out.println("���룺"+user.getPassword());
		System.out.println("��ַ��"+user.getAdress());
}
	/*
	 * �����ڶ��п���  user�ռ�
	 * Ȼ����ջ�п���һ��ջ֡�����account,name,password,adress
	 * Ȼ�����user.set____()������������ջ�п���һ��ջ֡��������user.set____�ľֲ������Ͳ���
	 * user.set____()��������Ӧ��ջ֡��ʧ 
	 * ֮��main�������������Ӧ��ջ֡��ʧ
	 */
}
