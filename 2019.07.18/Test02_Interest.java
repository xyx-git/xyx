package day05_practice;
/*
 * �����¹���
 *    ����Ϣ=������*���ʣ�  ÿ�»���=������ ���+����Ϣ��/�������ޣ�
 *         ��        ��                  ��     ��
 *        3�꣨36���£�         6.03%   
 *        5�꣨60���£�         6.12%
 *       12�꣨240���£�      6.39% 
 */
import java.util.Scanner;

public class Test02_Interest {
    double rate;
    int time;
    int money;
    double monthly;
    
//¼����Ҫ����Ľ��
    public void money() {
    	System.out.println("����������");
    	Scanner input=new Scanner(System.in);
    	int money=input.nextInt();
    	this.money=money;
    }
    
//¼����Ҫ��������޲���������
    public void rate () {
    	Scanner input=new Scanner(System.in);
    	
    	//��������ʣ�ͨ��ѡ��1��2��3ȷ��ʱ�䣬����������
    	boolean judje=true;
     do {
    	 System.out.println("��ѡ��������ޣ� \n 1.3�꣨36���£�  \n 2.5�꣨60���£� \n 3.20�꣨240���£�");
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
    		System.out.println("��ѡ������������ ���֣�1��2��3");
    		judje=true;
    	}
      }while(judje==true); 
      }
    
    public void monthly() {//�����¹�����ӡ
    	this.money();//��ȡ�����ܶ�
    	this.rate();//��ȡ����
    	this.monthly=((this.money*this.rate)+this.money)/(this.time*12);    //�����¹�	
//    	                         �¹�=����������*���ʣ�+�����/����������*12��
    	System.out.println("***�¹�Ϊ��"+this.monthly);//��ӡ���
    }
    
    public static void main(String[] args) {
    	Test02_Interest result=new Test02_Interest();
    	result.monthly();    	
	}
  
}
