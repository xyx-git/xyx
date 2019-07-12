package day02_practic;

public class test07_user {
 String name;
 int key;
 String email;
 String adress;
    public test07_user(String name,String email) {
    	System.out.println("用户"+name+"的电子邮箱是:"+email);
    }
    
    public  test07_user(String name,String email,int key) {
    	System.out.println("用户"+name+"的邮箱及密码是:"+email+"\n"+key);
    }
    public  test07_user(String adress) {
    	System.out.println("用户的地址是"+adress);
}
}
