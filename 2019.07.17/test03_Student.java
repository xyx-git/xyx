package day04_practice;

public class test03_Student {//����ѧ����
     String name;
     int age;
     String adress;
     
     
     //1��ʹ��this�����Ա������ֲ�����ͬ����ͻ������
     public test03_Student(int age) {
    	 this.age=age;
     }
     public void print() {
     	System.out.println(this.age);
     
     }
    public test03_Student(int age,String adress) {
		this(age);
	//1��ʹ��this�����Ա������ֲ�����ͬ����ͻ������
		this.adress=adress;
	//2��ʹ��this�������ع��췽��
		this.name=name;
	//3��ʹ��this���ó�Ա����
		this.print();
	}
     
   
	
	
}
