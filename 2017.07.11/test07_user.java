package day02_practic;

public class test07_user {
 String name;
 int key;
 String email;
 String adress;
    public test07_user(String name,String email) {
    	System.out.println("�û�"+name+"�ĵ���������:"+email);
    }
    
    public  test07_user(String name,String email,int key) {
    	System.out.println("�û�"+name+"�����估������:"+email+"\n"+key);
    }
    public  test07_user(String adress) {
    	System.out.println("�û��ĵ�ַ��"+adress);
}
}
