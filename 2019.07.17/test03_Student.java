package day04_practice;

public class test03_Student {//建立学生类
     String name;
     int age;
     String adress;
     
     
     //1、使用this解决成员变量与局部变量同名冲突的问题
     public test03_Student(int age) {
    	 this.age=age;
     }
     public void print() {
     	System.out.println(this.age);
     
     }
    public test03_Student(int age,String adress) {
		this(age);
	//1、使用this解决成员变量与局部变量同名冲突的问题
		this.adress=adress;
	//2、使用this调用重载构造方法
		this.name=name;
	//3、使用this调用成员方法
		this.print();
	}
     
   
	
	
}
