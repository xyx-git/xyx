package time;
/*
 * 获取当前的时间，然后输出明日此刻的时间
 * (要求输出格式 xxxx年xx月xx日  上午/下午    xx时：xx分：xx秒   星期几 )。
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01_tomorrow {

	public static void main(String[] args) {
		
		//创建Calendar对象
		Calendar c=Calendar.getInstance();
		//增加一天
		c.add(Calendar.DAY_OF_YEAR, 1);
		//设置为Date类型
		Date date=c.getTime();
		//设置格式
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E");
		//输出
		System.out.println("明日的此时此刻是:  "+sdf.format(date));
	}

}
