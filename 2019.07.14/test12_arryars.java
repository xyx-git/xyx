package day02_practic;
/*
 * ����һ������飬�����㴴����ʱ��
 */

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class test12_arryars {
	
	
    public static void gettime() {//��ʾϵͳʱ��  ����-��-��    Сʱ���֣��룩
    long time=System.currentTimeMillis();    //������Ϊ 1970�굽���ڵĺ�����
	Date date= new Date(time);               //ת����data��
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//��ʾ��ʽ
	String strTime=sdf.format(date);         //ת�����ַ�����ʽ
	System.out.println("���齨����ʱ���ǣ�"+strTime); 
    }
    
    
    public static void arrays() {//����10000������
    	int[] []  arrs=new int [10000] [3];//����һ������Ϊ10000�Ķ�ά����
    		//����ά�����е�ÿһ��Ԫ�ر��һ����������һά����
    	for(int i=0;i<arrs.length;i++) {
    			int arr[]=Arrays.copyOf(arrs[i], 3);
    			System.out.println(Arrays.toString(arr));
    		}	
    }
   
    public static void main(String[] args) {
		arrays();
		gettime();
	}
}
