package day02_practic;

public class test06_disply {

   public void disply(String name,int age) {
	   test06_person person=new test06_person(name,age);
	   System.out.println("������"+name+"\t"+"���䣺"+age);
   }
   
   public static void main(String[] args) {
	  
	   test06_disply dis=new test06_disply();
	   dis.disply("����", 12);
}
}
