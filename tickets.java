package day01_practic;

import java.util.Scanner;

/*
 * 7�����ݲ�ͬ���ο�������䣬������Ʊ����
 * ��Ʊ����
 *   1.10�꼰���£���Ʊ��ѣ�
 *   2.10��60�꣬��ƱȫƱ��
 *   3.����60�꣬��Ʊ���
 */
public class tickets {
   //���˶���Ϊһ��
	static String name;  //����
    static int age;      //����

public static void main(String[] args) {
	//����3����
	Scanner input=new Scanner(System.in);
	tickets p1=new tickets();
	boolean judje=false;
	Object go;
	do {
	System.out.print("������������");
	 tickets.name=input.next();
	System.out.print("���������䣺");
	tickets.age=input.nextInt();
	        //�ж�Ʊ��
	    if(tickets.age<18) {
	    	System.out.println("��Ʊ���");
	    }else if(tickets.age>17 && tickets.age<60) {
	    	System.out.println("��Ʊȫ�ۣ�20Ԫ");
	    }else {
	    	System.out.println("��Ʊ��ۣ�10Ԫ");
	    }
	     System.out.println("�Ƿ������y/n����");
	    String yes=input.next();
	        //����y�������룬n����ѭ��
	     if (yes.equals("y")) {
	    	 judje=true;
	     }else {
	    	 judje=false;
	    	 System.out.println("���������");
	     }
	     
	}while(judje=true);
}
}