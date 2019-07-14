package day02_practic;
/*
 * 创建一万个数组，并计算创建的时间
 */

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class test12_arryars {
	
	
    public static void gettime() {//显示系统时间  （年-月-日    小时：分：秒）
    long time=System.currentTimeMillis();    //输出结果为 1970年到现在的毫秒数
	Date date= new Date(time);               //转换成data类
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//显示格式
	String strTime=sdf.format(date);         //转换成字符串格式
	System.out.println("数组建立的时间是："+strTime); 
    }
    
    
    public static void arrays() {//创建10000个数组
    	int[] []  arrs=new int [10000] [3];//创建一个长度为10000的二维数组
    		//将二维数组中的每一个元素变成一个个独立的一维数组
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
