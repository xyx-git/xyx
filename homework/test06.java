package homework;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        System.out.println("请输入一个0-100的整数：");
       int a=input.nextInt();
       int b=(int) (Math.random()*100+1);
       boolean c=true;
       do {
       if (a>b) {
    	   System.out.println("猜大了");
    	   
       }else if (a==0) {
    	   System.out.println("游戏结束");
    	   break;
       }
       else if (a<b) {
    	   System.out.println("猜小了");
    	   
       }else if (a==b){
    	   System.out.println("猜对了");
    	   c=false;
    	   break;
       }  
       
          
       
       }while (c==false);
    	   
       
	}

}
