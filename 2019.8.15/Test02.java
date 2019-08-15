package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test02 {
/*
 * 2、自己键盘录入一个时间，格式为"yyyy-MM-dd HH:mm:ss"。
 * 然后分别输出这个时间的分量：年，月，日。
 * 如果录入的日期字符串格式不对，可重新录入时间。
 */
	public static void main(String[] args) {
			System.out.println("请输入时间: ");
			Date date=null;
		while(true) {
			//录入字符串
			Scanner in = new Scanner(System.in);		
			String input=in.nextLine();
			//设置SimpleDateFormat格式
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			try {
				//将字符串转换为Date格式
				 date=sdf.parse(input);
			} catch (ParseException e) {
				System.out.println("输入格式有误,请重新输入: ");
				continue;	
			}in.close();
			 break;
		}
			//创建Calendar对象
			Calendar c=Calendar.getInstance();
			c.setTime(date);
			//分别输出年 月 日
			System.out.println("年:"+c.getWeekYear());
			System.out.println("月:"+(c.get(Calendar.MONTH)+1));
			System.out.println("日:"+c.get(Calendar.DAY_OF_MONTH));
			
	}

}
