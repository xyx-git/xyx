package homework;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("������һ��0-100��������");
       int a=input.nextInt();
       int b=(int) (Math.random()*100+1);
       boolean c=true;
       do {
       if (a>b) {
    	   System.out.println("�´���");
    	   
       }else if (a==0) {
    	   System.out.println("��Ϸ����");
    	   break;
       }
       else if (a<b) {
    	   System.out.println("��С��");
    	   
       }else if (a==b){
    	   System.out.println("�¶���");
    	   c=false;
    	   break;
       }  
       
          
       
       }while (c==false);
    	   
       
	}

}
