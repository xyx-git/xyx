package homework;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("������һ��ֵ��");
         int a =input.nextInt();
         for(int b=0;b<=a;b++) {
        	 System.out.println(b+"+"+(a-b)+"="+a);
         }
	}

}
