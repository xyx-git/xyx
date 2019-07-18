package day05_practice;
/*
 * 计算月供：
 *    总利息=贷款金额*利率；  每月还款=（贷款 金额+总利息）/贷款年限；
 *         年        限                  利     率
 *        3年（36个月）         6.03%   
 *        5年（60个月）         6.12%
 *       12年（240个月）      6.39% 
 */
import java.util.Scanner;

public class Test02_Interest {
    double rate;
    int time;
    int money;
    double monthly;
    
//录入需要贷款的金额
    public void money() {
    	System.out.println("请输入贷款金额：");
    	Scanner input=new Scanner(System.in);
    	int money=input.nextInt();
    	this.money=money;
    }
    
//录入需要贷款的年限并计算利率
    public void rate () {
    	Scanner input=new Scanner(System.in);
    	
    	//计算贷款率，通过选择1，2，3确定时间，输入其它则
    	boolean judje=true;
     do {
    	 System.out.println("请选择贷款年限： \n 1.3年（36个月）  \n 2.5年（60个月） \n 3.20年（240个月）");
     	int choose=input.nextInt();
     	
    	switch(choose) {
    	case 1:
    		this.rate=0.00603;
    		judje=false;
    		this.money=3;
    		break;
    	case 2:
    		this.rate=0.00612;
    		judje=false;
    		this.money=5;
    		break;
    	case 3:
    		this.rate=0.00639;
    		judje=false;
    		this.money=20;
    		break;
    	default:
    		System.out.println("您选择有误，请输入 数字：1、2或3");
    		judje=true;
    	}
      }while(judje==true); 
      }
    
    public void monthly() {//计算月供并打印
    	this.money();//获取贷款总额
    	this.rate();//获取利率
    	this.monthly=((this.money*this.rate)+this.money)/(this.time*12);    //计算月供	
//    	                         月供=（（贷款金额*利率）+贷款金额）/（贷款年限*12）
    	System.out.println("***月供为："+this.monthly);//打印结果
    }
    
    public static void main(String[] args) {
    	Test02_Interest result=new Test02_Interest();
    	result.monthly();    	
	}
  
}
